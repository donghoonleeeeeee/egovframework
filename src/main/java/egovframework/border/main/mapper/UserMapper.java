package egovframework.border.main.mapper;

import egovframework.rte.psl.dataaccess.mapper.*;
import egovframework.border.main.vo.UserVO;
import egovframework.border.main.vo.LoginVO;

@Mapper("UserMapper")
public interface UserMapper 
{
	public int countUser() throws Exception;
	
	public int maxIdx() throws Exception;
	
	public void joinUser(UserVO userinfo) throws Exception;
	
	public int findUserid(String userid) throws Exception;
	
	public int findPassword(LoginVO loginvo) throws Exception;
}
