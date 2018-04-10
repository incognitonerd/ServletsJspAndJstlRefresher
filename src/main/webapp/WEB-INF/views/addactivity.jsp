<%@include file="../commons/header.jspf"%>
<%@include file="../commons/nav.jspf"%>
<div class="container">
	<h1>Username: ${username}</h1>
	<caption>New Outdoor Activity</caption>
	<form action="/add-activity.do" method="post">
		<fieldset class="form-group">
			<label>Activity</label> <input name="activity" type="text" class="form-control" />
		</fieldset>
		<fieldset class="form-group">
			<label>Season</label> <input name="season" type="text" class="form-control" /> <BR />
		</fieldset>
		<input name="add" type="submit" class="btn btn-success" value="Add" />
	</form>
</div>
<%@include file="../commons/footer.jspf"%>
















