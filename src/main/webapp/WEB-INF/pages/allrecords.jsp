<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${!empty createtask}">
		<table border="1" bgcolor="cyan" align="center">
			<tr>
				<th>TaskNo</th>
				<th>TaskName</th>
				<th>Duration</th>
				<th>StartDate</th>
				<th>EndDate</th>
				<th>TaskDescription</th>

			</tr>
			<c:forEach var="todo" items="${createtask}">
				<tr>
					<td>${todo.taskno}</td>
					<td>${todo.taskname}</td>
					<td>${todo.duration}</td>
					<td>${todo.startdate}</td>
					<td>${todo.enddate}</td>
					<td>${todo.taskdescription}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">Records not found</h1>
	</c:otherwise>
</c:choose>
<br>
<br>
<hr>
<td></td>