<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body bgcolor="#b3ffff">

<jsp:include page = "banner.jsp"></jsp:include>
<h2>Login</h2>
<form action="User.hola">
  Email:<br>
  <input type="email" name="email" required>
  <br>
  Password:<br>
  <input type="password" name="password" required>
  <br>
  <input type="submit" value="Submit">
  <br>
  <a href="forget.jsp">Forgot password</a>
  <br>
  <a href="register.jsp"> New user? Register</a>
  
</form> 
<%@ include file ="footer.html" %>
</body>

</html>