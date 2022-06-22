<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Input Trainee Details</h2>

<form action="add-trainee" method="post">
	Trainee Name : <input type="text" name="traineeName">
	Domain : <select name="domain">
				<option>Java/JEE</option>
				<option>Node JS</option>
				<option>DevOps</option>
				<option>Cloud</option>
			</select>
	Email : <input type="email" name="email">
	<button type="submit">Enter Details</button>
	

</form>

</body>
</html>