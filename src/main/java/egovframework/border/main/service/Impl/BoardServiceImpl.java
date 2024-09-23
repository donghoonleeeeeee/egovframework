package egovframework.border.main.service.Impl;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.border.main.mapper.BoardMapper;
import egovframework.border.main.service.BoardService;
import egovframework.border.main.vo.BoardVO;

@Service("BoardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService 
{
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public int countBoard() throws Exception
	{
		return boardMapper.countBoard();
	}
	
	@Override
	public void insertBoard(BoardVO boardvo) throws Exception
	{
		try
		{
			boardvo.setS_file(boardvo.getUpfile().getOriginalFilename());
			boardvo.setO_file(boardvo.getUpfile().getOriginalFilename());
			boardvo.setIdx(boardMapper.maxIdx()+1);
			
			boardMapper.insertBoard(boardvo);
		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
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
	
	@Override
	public int maxIdx() throws Exception
	{
		return boardMapper.maxIdx();
	}
	
	@Override
	public List<BoardVO> boardList() throws Exception
	{
		List<BoardVO> boardVO = null; 
		try
		{
		boardVO = boardMapper.boardList();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		for(int a=0; a<boardVO.size(); a++)
		{
			BoardVO vo = boardVO.get(a);
		}
		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		
		return boardVO;
	}
	
	@Override
	public BoardVO getBoard(int idx) throws Exception
	{
		return boardMapper.getBoard(idx);
	}
}
