<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Servlets, Jsps, and JSTLs</title>
</head>
<body>
	<nav role="navigation" class="navbar navbar-default">
		<div class="">
			<a href="/" class="navbar-brand">Brand</a>
		</div>
		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/list-activities.do">Activities</a></li>
				<li><a href="https://www.google.com/">Facebook</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/logout.do">Logout</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<form action="/login.do" method="post">
			<p>
				<font color="red">${errMsg}</font>
			<p>
				Username: <input type="text" name="username" /><br>
				<!--  -->
				Password: <input type="password" name="password" /><br>
				<!--  -->
				<input type="submit" value="Login"> <br>
		</form>
	</div>

	<footer class="footer">
		<div class="container">
			<p>footer content</p>
		</div>
	</footer>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
















