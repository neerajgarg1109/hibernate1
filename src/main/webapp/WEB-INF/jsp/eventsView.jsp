<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="css/styles.css"></link>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Existing Events</title>

</head>

<body>
<h1>Existing Events</h1>
<c:url var="addEventUrl" value="/events/add.html" />
<a href="${addEventUrl}">Add Event</a>

<br /><br />
<c:if test="${!empty events}">
	<table class="table">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Date</th>
		</tr>
		
		<c:forEach items="${events}" var="event">
		<tr>
			<td><c:out value="${event.id}" /></td>
			<td><c:out value="${event.title}" /></td>
			<td><c:out value="${event.date}" /></td>
		</tr>
		</c:forEach>
	</table>
</c:if>
<c:if test="${empty events}">
	There are currently no events scheduled.
</c:if>
</body>
</html>