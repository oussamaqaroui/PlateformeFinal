<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<sec:authorize access="isAuthenticated()">
    authenticated as <sec:authentication property="principal.username" /> 
</sec:authorize>
<br/>
<a href="<c:url value="/j_spring_security_logout" />">Logout</a>
</body>
</html>
