<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Password</title>
</head>
<body bgcolor="#b3ffff">
	<jsp:include page="banner.jsp"></jsp:include>
	<form action="User.hola">
		Email-Id:<br> <input type="email" name="email" required>
		<br> Question:<br>
		<pre>What is your favorite movie?</pre>
		Answer:<br> <input type="text" name="movie" required> <br>
		<br> <input type="submit" value="change">

	</form>
	<%@ include file="footer.html"%>
</body>
</html>