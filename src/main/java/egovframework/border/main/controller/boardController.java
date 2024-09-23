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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.border.main.service.BoardService;
import egovframework.border.main.vo.BoardVO;

@Controller
public class boardController 
{
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list.do")
	public String listPage(Model model) throws Exception
	{
		model.addAttribute("list", boardService.boardList());
		return "list";
	}
	
	@GetMapping("/write.do")
	public String writePage(Model model, HttpServletRequest request) throws Exception
	{
		model.addAttribute("userid", boardService.getCookie(request));
		return "write";
	}
	
	@PostMapping("/write_proc.do")
	public void write_proc(@ModelAttribute BoardVO boardVO, HttpServletResponse response) throws Exception
	{
		boardService.insertBoard(boardVO);
		
		response.sendRedirect("/Test_Border/list.do");
	}
	
	@GetMapping("/view.do")
	public void viewPage(@RequestParam int idx, Model model) throws Exception
	{
		
		model.addAttribute("board", boardService.getBoard(idx));
	}
}
