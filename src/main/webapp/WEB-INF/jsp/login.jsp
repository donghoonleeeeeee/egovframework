<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<form name="mf" method="POST" action="/Test_Border/login_proc.do">
<table>
	<tr>
		<td colspan=3>Login</td>
	</tr>
	
	<tr>
		<td><span><b>ID</b></span></td>
		<td><input type="text" name="userid" id="userid"></td>
		<td rowspan=2><input type="submit" value="LOGIN" style="height:50px;" onclick="login()"></td>
	</tr>
	
	<tr>
		<td><span><b>PASSWORD</b></span></td>
		<td><input type="password" name="password" id="password"></td>
	</tr>
	
	<tr>
		<td colspan=3>
			<a href="/Test_Border/join.do"><span>회원가입</span></a>
			<span> / </span>
			<span>아이디찾기</span>
			<span> / </span>
			<span>비밀번호 찾기</span>
		</td>
	</tr>
</table>
</form>
</body>
<script type="text/javascript">
function login()
{
	if(document.getElementById("userid").value == "")
		{
			alert("아이디를 입력해주세요.");
			mf.userid.focus();
			return false;
		}
	else if(docuement.getElementById("password"))
		{
			alert("비밀번호를 입력해주세요.");
			mf.password.focus();
			return false;
		}
}
</script>
</html>