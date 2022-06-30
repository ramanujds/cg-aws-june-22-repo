<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="add-employee" method="post">
ID : <input type="number" name="id">
Name : <input type="text" name="employeeName">
Email : <input type="email" name="email">
Joined Date : <input  type="date" name="hiredate">
<button type="submit">Add Employee</button>

</form>

</div>

<div>
<form action="search-employee">
ID : <input type="search" name="empid">
<button type="submit">Search Employee</button>
</form>
</div>

</body>
</html>