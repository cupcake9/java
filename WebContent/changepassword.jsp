<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="banner.jsp"></jsp:include>
		<form action="User.hola">
Email-Id:<br> <input type="email" name="email" required>
			New password: <br> <input type="password" name="password"
				value="" required> <br> <input type="submit"
				value="Submit">
		</form>
		<%@ include file="footer.html"%></body>


</html>