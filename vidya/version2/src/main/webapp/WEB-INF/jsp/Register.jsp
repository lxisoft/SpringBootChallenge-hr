<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>REGISTRATION FORM</h1>
<form action="/registerSucessfully" method="post"
		enctype="multipart/form-data">
<table border="1px">

<tr>
<td>Name</td>
<td><input type="text" name="name" ></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="email" ></td>
</tr>

<tr>
<td>Phone Number</td>
<td><input type="text" name="phoneNumber"></td>
</tr>

<tr>
<td>Photo</td>
<td><input type="file" name="photo" ></td>
</tr>

<tr>
<td>Upload Resume</td>
<td><input type="file" name="resumePdf"></td>
</tr>

<tr>
<td>User_Name</td>
<td><input type="text" name="username" ></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" ></td>
</tr>

<tr>

<td><input type="submit" ></td>
</tr>
</table>
</form>



</body>
</html>