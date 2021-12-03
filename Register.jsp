<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>



<body>
<h2 style="font-size; 20 px;">Enter Details</h2>
<form method="post"  action="RegisterServlet">
First Name <input type="text" name="firstName"/><br>
Last Name <input type="text" name="lastName"/><br>
Email <input type="email" name="email"/><br>
Gender
<input type="radio" name="gender" value="Male"/>Male<br>
<input type="radio" name="gender" value="Female"/>Female<br>
Country
<select name="country">
<option selected="selected">---Select---</option>
<option value="India">India</option>
<option value="US">US</option>
<option value="UK">UK</option>
</select><br>
<input type="submit" value="Register" name="register"/>

</form>
</body>
</html>