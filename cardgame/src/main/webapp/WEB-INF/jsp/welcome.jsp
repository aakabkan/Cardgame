<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card game</title>
<link rel="stylesheet" href="/resources/board.css"/>
</head>
<body>
    Welcome to this card game! Start a game by clicking on the button below.<p>
    Rules: Just click on the card you want to play, and try to end with as high score as possible</p>
    <form method="post">
		<label for="nPlayers">Number of players:</label>
		<select id="nPlayers" name="nPlayers">
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="4" selected>4</option>
		</select>
        <input type="submit" value="Create game"/>
    </form>
</body>
</html>