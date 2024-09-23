package egovframework.border.main.service.Impl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.border.main.mapper.UserMapper;
import egovframework.border.main.service.UserService;
import egovframework.border.main.vo.UserVO;
import egovframework.border.main.vo.LoginVO;

@Service("UserService")
public class UserServiceImpl extends EgovAbstractServiceImpl implements UserService 
{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int countUser() throws Exception
	{
		return userMapper.countUser();
	}
	
	@Override
	public int maxIdx() throws Exception
	{
		int max = userMapper.maxIdx();
		
		if(max<1)
		{
			return 1;
		}
		else	
		{
			return max+1;
		}
		
	}
	
	@Override
	public void joinUser(UserVO userinfo) throws Exception
	{
		userinfo.setIdx(maxIdx());
		userMapper.joinUser(userinfo);
	}
	
	@Override
	public String findUser(LoginVO loginvo, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String result = null;
		// 로그인 한 ID와 일치하는 ID가 없으면
		if(userMapper.findUserid(loginvo.getUserid()) < 1)
		{
			result = "userid_not";
		}
		else if(userMapper.findPassword(loginvo) < 1)
		{
			result = "password_not";
		}
		else	
		{
			// 로그인 성공 시 userid로 쿠키 생성
			result = loginvo.getUserid();
			setCookie(loginvo.getUserid(), request, response);
		}
		return result;
	}
	
	@Override
	public void setCookie(String userid, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		Cookie loginCookie = new Cookie("userid", userid);
		loginCookie.setMaxAge(60*60);
		response.addCookie(loginCookie);
	}
	
	@Override
	public String getCookie(HttpServletRequest request) throws Exception
	{
		String userid = null;
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null || cookies.length > 0)
		{
			for(Cookie cookie : cookies)
			{
				if(cookie.getName().equals("userid"))
				{
					userid = cookie.getValue();
					break;
				}
			}
		}
		return userid;
	}
}
