package egovframework.border.main.service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import egovframework.border.main.vo.BoardVO;


public interface BoardService 
{
	public int countBoard() throws Exception;
	
	public void insertBoard(BoardVO boardvo) throws Exception;
	
	public int maxIdx() throws Exception;
	
	public String getCookie(HttpServletRequest request) throws Exception;
	
	public List<BoardVO> boardList() throws Exception;
	
	public BoardVO getBoard(int idx) throws Exception;
}
