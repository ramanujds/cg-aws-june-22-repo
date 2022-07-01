<%@page import="com.cg.employeeapp.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>

	<%
	List<Employee> empList = (List<Employee>) request.getAttribute("employees");
	%>

	<table class="table table-hover">
		<thead>
			<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Email</td>
			<td>Joined Date</td>
			<td>Job</td>
			<td>More Options</td>
			</tr>
		</thead>

		<tbody>
		<%
			for(Employee emp:empList){
				out.print("<tr>");
				out.print("<td>"+emp.getId()+"</td>");
				out.print("<td>"+emp.getEmployeeName()+"</td>");
				out.print("<td>"+emp.getEmail()+"</td>");
				out.print("<td>"+emp.getHiredate()+"</td>");
				out.print("<td>"+emp.getJobTitle()+"</td>");
				out.print("<td><a href='delete?id="+emp.getId()+"'>Delete</a></td>");
				out.print("</tr>");
			}
		
		%>
		</tbody>

	</table>

</body>
</html>