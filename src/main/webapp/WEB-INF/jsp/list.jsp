<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Page</title>
</head>
<body>
<table border=1>
	<tr>
		<td colspan=4>BORDER</td>
	</tr>
	
	<tr>
		<td>NO</td>
		<td style="width:100px;">TITLE</td>
		<td>USER</td>
		<td>DATE</td>
	</tr>
	
	<c:forEach var="board" items="${list}">
	<tr>
		<td>${board.idx}</td>
		<td><a href="/Test_Border/view.do?idx=${board.idx}">${board.title}</a></td>
		<td>${board.userid}</td>
		<td>${board.reg_date}</td>
	</tr>
	</c:forEach>
	
	<tr>
		<td colspan=4>
			<a href="/Test_Border/write.do"><input type="button" value="작성"></a>
		</td>
	</tr>
</table>
</body>

<script type="text/javascript">
	var serverResult = '${result}'; 
	
	window.onload = function()
	{
		if(serverResult == "userid_not")
			{
				alert("일치하는 ID가 없습니다.");
				history.back();
			}
		else if(serverResult == "password_not")
			{
				alert("비밀번호가 일치하지 않습니다.");
				history.back();
			}
	};
	
function write()
{
	location.href='/Test_Border/write.do?userid=' + serverResult;	
}
</script>
</html>