<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h1>Authentication</h1>
    <br />
	<form name="login-form" action="j_spring_security_check" method="post">
    	<input name="j_username" type="text" />
    	<input name="j_password" type="password" />
    	<input type="submit" name="submit" value="Login" />
	</form>
</body>
</html>