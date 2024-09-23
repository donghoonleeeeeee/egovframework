<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write Page</title>
</head>
<body>
<form name="mf" method="POST" action="/Test_Border/write_proc.do" onsubmit="return write_info()" enctype="multipart/form-data">
<table>
	<tr>
		<td><span>작성자</span></td>
		<td>
			<span>${userid}</span>
			<input type="hidden" name="userid" value="${userid}">
		</td>
	</tr>

	<tr>
		<td><span>제목</span></td>
		<td><input type="text" name="title" id="title"></td>
	</tr>
	
	<tr>
		<td><span>내용</span>
		<td><textarea name="content" id="content"></textarea></td>
	</tr>
	
	<tr>
		<td><span>첨부파일</span></td>
		<td><input type="file" name="upfile" id="upfile" enctype="multipart/form-data"></td>
	</tr>
	
	<tr>
		<td colspan=2>
			<button type="submit">작성</button>
		</td>
	</tr>
</table>
</form>
</body>
<script type="text/javascript">
function write_info()
{
	if(document.getElementById("title").value == "")
		{
			alert("제목을 입력하세요");
			mf.title.focus();
			return false;
		}
	
	if(document.getElementById("content").value == "")
		{
			alert("내용을 입력하세요");
			mf.content.focus();
			return false;
		}
}
</script>
</html>