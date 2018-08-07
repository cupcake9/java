<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="#b3ffff"> 
<jsp:include page = "banner.jsp"></jsp:include>
<h2>Register as a new user!</h2>
	<form action="User.hola">
	
		First name:
		<br> 
		<input type="text" name="name" value="" required>
		<br>
		 E-mail:
		 <br> 
		 <input type="email" name="email" value="" required pattern="[a-z0-9.)%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$">
		 <br>
		Password:
		<br>
		 <input type="password" name="password" value="" required pattern=".{8,}" title="More than 8 characters!" >
		 <br>
		Gender:
		<br> 
		<input type="radio" name="gender" value="male"checked required> Male 
		<input type="radio" name="gender" value="female" required> Female
		<input type="radio" name="gender" value="others" required> Others
		<br> 
		<br>
		Age:<select name="age">
		<% for(int a=18;a<=60;a++){ %>
			<option value="<%=a%>"><%=a %></option>
			<%} %>
			</select>
		 <br>
		 <br>
		  City:
		  <br>
		  <select name="city">
		  <% String[] cities={"Mumbai","Pune","Mangalore","Noida","Kanpur"};
		  for(String ct:cities){ %>
		  <option value="<%=ct%>"><%=ct%></option>
		  <%} %>
		  </select>
		   <br>
		  Favorite Movie:
		    <br>
		<input type="text" name="movie" value="" required> 
		<br>
		 Photo:
		 <br>
		<input type="file" name="photo" value="fileupload"	id="fileupload">
		 <br>
		 <br>
	
		<input type="submit" value="register">
	</form>
	<%@ include file ="footer.html" %>
</body>
</html>