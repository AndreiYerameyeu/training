<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/main.css" media="all">
<title>Login Page</title>
</head>
<body>
	<div class="loginarea">
		<form action="../login" method="GET" class="loginform">
			<table class="logintable">
				<tr>
					<td>Login:</td>
					<td><input type="text" name="first_name"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="last_name" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>