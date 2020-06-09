<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
<link rel="stylesheet" href="/resources/board.css"/>
</head>
<body>
	Here you can sign up<p>
    <font color="red">${errorMessage}</font>
    <form method="post">
        Name : <input type="text" name="name" /><p>
        Password : <input type="password" name="password" /><p> 
        Re-type password : <input type="password" name="repassword" /><p> 
        <input type="submit" value="Sign up"/>
    </form> 
</body>
</html>