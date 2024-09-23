<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="mf" method="POST" action="/Test_Borde/modify_proc.do">
<table border=1>
	<tr>
		<td colspan=2>Board</td>
	</tr>
	
	<tr>
		<td>작성자</td>
		<td>
		<span>${board.userid}</span>
		<input type="hidden" name="idx" id="idx" value="${board.idx}">
		</td>
	</tr>
	
	<tr>
		<td>제목</td>
		<td><input type="text" name="title" id="title" value="${board.title}"></td>
	</tr>
	
	<tr>
		<td>내용</td>
		<td><textarea name="content" id="content">${board.content}</textarea></td>
	</tr>
	
	<tr>
		<td colspan=2>
			<input type="submit" value="완료">
		</td>
	</tr>
</table>
</form>
</body>
</html>