<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Servlets, Jsp, and JSTLs</title>
</head>
<body>
	<form action="/login.do" method="post">
		Favorite Sport <input type="text" name="sport"> <input type="submit" value="Submit"> <br> <br>
		<!--  -->
		<p>
			<font color="red">${errMsg}</font>
		<p>
			Username: <input type="text" name="username" /><br>
			<!--  -->
			Password: <input type="password" name="password" /><br>
			<!--  -->
			<input type="submit" value="Submit"> <br>
	</form>
</body>
</html>