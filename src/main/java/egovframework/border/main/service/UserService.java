package egovframework.border.main.service;

import egovframework.border.main.vo.UserVO;
import egovframework.border.main.vo.LoginVO;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public interface UserService 
{
	public int countUser() throws Exception;
	
	public int maxIdx() throws Exception;
	
	public void joinUser(UserVO userinfo) throws Exception;
	
	public String findUser(LoginVO loginvo, HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public void setCookie(String userid, HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public String getCookie(HttpServletRequest request) throws Exception;
}
