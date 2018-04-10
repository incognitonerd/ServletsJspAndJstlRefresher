<%@include file="../commons/header.jspf"%>
<%@include file="../commons/nav.jspf"%>
<div class="container">
	<h1>Username: ${username}</h1>
	<table class="table table-striped">
		<caption>Outdoor Activities</caption>
		<thead>
			<th>Activity</th>
			<th>Season</th>
			<th>Operations</th>
		</thead>
		<tbody>
			<c:forEach items="${activities}" var="activity">
				<tr>
					<td>${activity.name}</td>
					<td>${activity.season}</td>
					<td>&nbsp;&nbsp;<a class="btn btn-danger" href="/remove-activity.do?activity=${activity.name}&season=${activity.season}">Remove</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a class="btn btn-success" href="/add-activity.do">Add New Activity</a>
</div>
<%@include file="../commons/footer.jspf"%>