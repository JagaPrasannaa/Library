<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Form</title>

</head>
<body>
	<form:form name="registerForm" method="POST" action="register">
		<div align="center">
			<table>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="empName" /></td>
				</tr>
				<tr>
					<td>Dept</td>
					<td><select name="dept">
					<c:forEach items="${Book}" var="book">
						<option>${book.name}</option>
					</tr>
				</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>Return Date</td>
					<td><input type="text" name="rdate" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register" /></td>
					<td><input type="submit" value="Modify"
						onclick="document.registerForm.action='fetch'" /></td>
				</tr>
			</table>
			<div style="color: red">${msg}</div>
		</div>
	</form:form>
</body>
</html>