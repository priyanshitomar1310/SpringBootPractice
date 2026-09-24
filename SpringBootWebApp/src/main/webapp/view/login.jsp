<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>

<head>
	<title>My First Spring Boot Web App</title>
	<link rel="stylesheet" href="../Css/login.css">
	
</head>

<body>

	<h1>LogIn Page</h1>
	<div>
		<form action="/profilePage" method="post">
			Email Id: <br><br><input type="email" name="email" required>
			<br> <br>
			Password: <br><br><input type="password" name="password" required>
			<br> <br>
			<center><button type="submit">LogIn</button>
				<br> <br>
			<span><a href="/registerPage">SignUp</a> <a href="help.html">Get Help?</a></span>
		</center>
		<c:if test="${not empty errorMsg}">
										<h3 style="color:red">${errorMsg}</h3>
										</c:if>
		</form>

	</div>

</body>

</html>