<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="#b3ffff"> 
<h2>Register as a new user!</h2>
	<form>
		First name:
		<br> 
		<input type="text" name="firstname" value="" required>
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
		Age:
		<br>
		 <input	type="number" name="age" value="" required min="14" max="100" >
		 <br>
		  City:
		  <br> 
		  <input type="text" name="city" value="" required>
		   <br>
		    Movie:
		    <br>
		<input type="text" name="movie" value="" required> 
		<br>
		 Photo:
		 <br>
		<input type="file" name="fileupload" value="fileupload"	id="fileupload">
		 <br>
		 <br>
		<input type="image" src="" width="100" height="50">
		<input type="submit" value="Submit">
	</form>
</body>
</html>