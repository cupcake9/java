<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
</head>
<body>
<form action="/action_page.php">
  First name:<br>
  <input type="text" name="firstname" value="" >
  <br>
 E-mail:<br>
<input type="text" name="mail"   value=""><br>
 Password:<br>
<input type="password" name="password"  value=""><br>
Gender:<br>
<input type="radio" name="gender" value="male" checked> Male
  <input type="radio" name="gender" value="female"> Female<br>
  
Age:<br>
  <input type="number" name="age" value=""><br>
   City:<br>
  <input type="text" name="city" value="" >
  <br>
   Movie:<br>
  <input type="text" name="movie" value="" >
  <br>
 Photo:<br>
  <input type="file" name="fileupload" value="fileupload" id="fileupload"> 
   <br>
  <br><input type="image" src="" width="100" >

<br>
  
<input type="submit" value="Submit">
</form> 
</body>
</html>