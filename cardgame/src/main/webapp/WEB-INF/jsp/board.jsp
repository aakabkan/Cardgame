<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card game board</title>
<link rel="stylesheet" href="/resources/board.css"/>
<!-- <script src="/resources/board.js"></script>-->
</head>
<body>
	Hi ${name}, this is the game board!<p>
	<table>
		<tr>
            <th></th>
            <th>Score</th>
            <th>Cards</th>
            <th>Plays</th>
		</tr>
		<c:choose>
	        <c:when test="${nPlayers>=2}">
	        	<tr>
		            <td>You:</td>
		            <td>${score1}</td>
		            <td>${draw1}</td>
		            <td>${play1}</td>
	            <tr/>
	        	<tr>
		            <td>Player 2:</td>
		            <td>${score2}</td>
		            <td>${draw2}</td>
		            <td>${play2}</td>
	            <tr/>
	        </c:when>
	    </c:choose>
	    <c:choose>
	        <c:when test="${nPlayers>=3}">
	        	<tr>
		            <td>Player 3:</td>
		            <td>${score3}</td>
		            <td>${draw3}</td>
		            <td>${play3}</td>
	        	</tr>
	        </c:when>
	    </c:choose>
	    <c:choose>
	        <c:when test="${nPlayers==4}">
	        	<tr>
		            <td>Player 4:</td>
		            <td>${score4}</td>
		            <td>${draw4}</td>
		            <td>${play4}</td>
	        	</tr>
	        </c:when>
	    </c:choose>
    </table><p>
	<c:choose>
        <c:when test="${!ended}">
			<c:choose>
		        <c:when test="${draw1>=1}">
			 		<div class="box" id="box1" onclick="location.href='/board?cardNumber=1'"><p id="p1">${description1}</p></div>
		        </c:when>
		    </c:choose>
		    <c:choose>
		        <c:when test="${draw1>=2}">
					<div class="box" id="box2" onclick="location.href='/board?cardNumber=2'"><p id="p2">${description2}</p></div>
		        </c:when>
		    </c:choose>
		    <c:choose>
		        <c:when test="${draw1>=3}">
					<div class="box" id="box3" onclick="location.href='/board?cardNumber=3'"><p id="p3">${description3}</p></div>
		        </c:when>
		    </c:choose>
		    <c:choose>
		        <c:when test="${draw1>=4}">
					<div class="box" id="box4" onclick="location.href='/board?cardNumber=4'"><p id="p4">${description4}</p></div>
		        </c:when>
		    </c:choose>
		    <c:choose>
		        <c:when test="${draw1>=5}">
					<div class="box" id="box5" onclick="location.href='/board?cardNumber=5'"><p id="p5">${description5}</p></div>
		        </c:when>
		    </c:choose>
		    <c:choose>
		        <c:when test="${draw1>=6}">
					<div class="box" id="box6" onclick="location.href='/board?cardNumber=6'"><p id="p6">${description6}</p></div>
		        </c:when>
		    </c:choose>
        </c:when>
        <c:otherwise>        
            <form method="post">
				<label for="nPlayers">Number of players:</label>
				<select id="nPlayers" name="nPlayers">
				  <option value="2">2</option>
				  <option value="3">3</option>
				  <option value="4" selected>4</option>
				</select>
		        <input type="submit" value="Create game"/>
		    </form>
        </c:otherwise>       
    </c:choose>
</body>
</html>