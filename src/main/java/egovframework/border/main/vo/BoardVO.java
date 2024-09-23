package egovframework.border.main.vo;

import org.springframework.web.multipart.MultipartFile;
import java.sql.Date;

public class BoardVO 
{
	private int idx;
	private String Userid;
	private String title;
	private String content;
	private MultipartFile upfile;
	private String s_file;
	private String o_file;
	private Date reg_date;
	
	public int getIdx() 
	{
		return idx;
	}
	public void setIdx(int idx) 
	{
		this.idx = idx;
	}
	
	public String getUserid() 
	{
		return Userid;
	}
	public void setUserid(String userid) 
	{
		Userid = userid;
	}
	
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getContent() 
	{
		return content;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}
	
	public MultipartFile getUpfile()
	{
		return this.upfile;
	}
	public void setUpfile(MultipartFile upfile)
	{
		this.upfile = upfile;
	}
	
	public String getS_file() 
	{
		return s_file;
	}
	public void setS_file(String s_file) 
	{
		this.s_file = s_file;
	}
	
	public String getO_file() 
	{
		return o_file;
	}
	public void setO_file(String o_file) 
	{
		this.o_file = o_file;
	}
	
	public Date getReg_date() 
	{
		return reg_date;
	}
	public void setReg_date(Date reg_date) 
	{
		this.reg_date = reg_date;
	}
	
	
}
