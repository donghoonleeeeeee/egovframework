<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td colspan=2>Board</td>
	</tr>
	
	<tr>
		<td>작성자</td>
		<td>${board.userid}</td>
	</tr>
	
	<tr>
		<td>제목</td>
		<td>${board.title}</td>
	</tr>
	
	<tr>
		<td>내용</td>
		<td>${board.content}</td>
	</tr>
	
	<tr>
		<td colspan=2>
			<input type="button" value="수정">
			<input type="button" value="삭제">
		</td>
	</tr>
</table>
</body>
</html>