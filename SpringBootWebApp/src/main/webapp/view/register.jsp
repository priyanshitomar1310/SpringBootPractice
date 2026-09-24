<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@ taglib prefix="c" uri="jakarta.tags.core" %>	

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Page</title>
	<link rel="stylesheet" href="/Css/signup.css">
</head>
<body>
	<big>
			<h1>Create Account</h1>
		</big>
		<div>
			<form action="/register" method="post">
				Enter Name: <br><br><input type="text" name="name" required><br><br>
				Enter DOB: <br><br><input type="date" name="dateOfBirth"required><br><br>
				Enter Email Id:<br><br> <input type="email" name="email"required><br><br>
				Create New Password: <br><br><input type="password" name="password"required><br><br>
				<button type="submit">Create Account</button>
			</form>
			<c:if test="${not empty successMsg}">
				<h3 style="color:green">${successMsg}</h3>
				</c:if>
				<c:if test="${not empty errorMsg}">
								<h3 style="color:red">${errorMsg}</h3>
								</c:if>
		</div>
</body>
</html>