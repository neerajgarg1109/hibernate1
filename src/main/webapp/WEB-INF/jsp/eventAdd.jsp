<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Add Event</title>

</head>

<body>
<h1>Add Event</h1>
<c:url var="viewEventsUrl" value="/events.html" />
<a href="${viewEventsUrl}">View Existing Events</a>

<br /><br />
<c:url var="saveEventUrl" value="/events/save.html" />
<form:form modelAttribute="event" method="POST" action="${saveEventUrl}">
	<form:label path="title">Title:</form:label>
	<form:input path="title"/><br />
	<form:label path="date">Date:</form:label>
	<form:input path="date"/><br />
	<input type="submit" value="Save Event" />
</form:form>

</body>
</html>