<%@include file="../commons/header.jspf"%>
<%@include file="../commons/nav.jspf"%>
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
<%@include file="../commons/footer.jspf"%>
















