<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Page</title>
</head>
<body>
<form name="mf" method="POST" action="/Test_Border/join_proc.do">
<table>

	<tr>
		<td colspan=2><span>User Info</span></td>
	</tr>
	
	<tr>
		<td>UserID</td>
		<td><input type="text" name="userid" id="userid"></td>
	</tr>
	
	<tr>
		<td>PassWord</td>
		<td><input type="password" name="password" id="password"></td>
	</tr>
	
	<tr>
		<td>PassWord Check</td>
		<td><input type="password" name="password_check" id="password_check"></td>
	<tr>
	
	<tr>
		<td>Name</td>
		<td><input type="text" name="name" id="name"></td>
	</tr>
	
	<tr>
		<td>Age</td>
		<td><input type="number" name="age" id="age"></td>
	</tr>
	
	<tr>
		<td>Address</td>
		<td><input type="text" name="address" id="address"></td>
	</tr>
	
	<tr>
		<td colspan=2>
		<input type="submit" value="JOIN" onclick="join()">
		</td>
	</tr>
</table>
</form>
</body>
<script type="text/javascript">
function join()
{
	if(document.getElementById("userid").value == "")
		{
			alert("사용할 아이디를 입력하세요");
			mf.userid.focus();
			return false;
		}
	else if(document.getElementById("password").value == "")
		{
			alert("사용할 비밀번호를 입력하세요");
			mf.password.focus();
			return false;
		}
	else if(document.getElementById("password_check").value == "")
		{
			alert("비밀번호 확인을 입력하세요");
			mf.password_check.focus();
			return false;
		}
	else if(document.getElementById("name").value == "")
		{
			alert("가입자의 이름을 입력하세요");
			mf.name.focus();
			return false;
		}
	else if(document.getElementById("age").value == "")
		{
			alert("가입자의 나이를 입력하세요");
			mf.age.focus();
			return false;
		}
	else if(document.getElementById("address").value == "")
		{
			alert("주소를 입력하세요");
			mf.address.focus();
			return false;
		}
	else if(document.getElementById("password").value != document.getElementById("password_check").value)
		{
			alert("비밀번호를 다시 확인해주세요");
			return false;
		}
}
</script>
</html>