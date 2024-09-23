package egovframework.border.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.border.main.service.UserService;
import egovframework.border.main.vo.LoginVO;
import egovframework.border.main.vo.UserVO;
import egovframework.border.main.vo.BoardVO;

@Controller
public class userController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/login.do")
	public String loginPage(Model model) throws Exception
	{
		int count = userService.countUser();
		System.out.println("DB 확인 / 회원 수: "+count);
		
		model.addAttribute("DB", count);
		return "login";
	}
	
	@PostMapping("/login_proc.do")
	public void login_proc(@ModelAttribute LoginVO loginvo,HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String result = userService.findUser(loginvo, request, response);
		response.sendRedirect("/Test_Border/list.do");
	}
	
	@GetMapping("/join.do")
	public String joinPage() throws Exception
	{
		return "join";
	}
	
	@PostMapping("/join_proc.do")
	public void join_proc(@ModelAttribute UserVO userinfo, HttpServletResponse response) throws Exception
	{
		userService.joinUser(userinfo);
		response.sendRedirect("/Test_Border/login.do");
	}
	

	

}
