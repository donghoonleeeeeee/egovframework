package egovframework.border.main.mapper;

import egovframework.rte.psl.dataaccess.mapper.*;
import egovframework.border.main.vo.BoardVO;
import java.util.List;

@Mapper("BoardMapper")
public interface BoardMapper 
{
	public int countBoard() throws Exception;
	
	public void insertBoard(BoardVO boardvo) throws Exception;
	
	public int maxIdx() throws Exception;
	
	public List<BoardVO> boardList() throws Exception;
	
	public BoardVO getBoard(int idx) throws Exception;
}
