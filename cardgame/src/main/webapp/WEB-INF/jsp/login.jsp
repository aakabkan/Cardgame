<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Card game</title>
<link rel="stylesheet" href="/resources/board.css"/>
</head>
<body>
    <font color="red">${errorMessage}</font>
    <form method="post">
        Name : <input type="text" name="name" /><p>
        Password : <input type="password" name="password" /><p> 
        <input type="submit" value="Log in"/><p><br>
    Not a member? <a href="/signup">Sign up!</a>
    </form><p>
 </body>
</html>