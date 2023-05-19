<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC project 2</title>
</head>
<body>
<form action="hello" method="post">
		<input type="text" name="t1"><br /> <input type="submit"
			value="sayHello">

	</form>
	<form action="viewDetails" method="post">
		First Name: <input type="text" name="firstName"><br />
		Last Name: <input type="text" name="lastName"><br /> 
		Email: <input type="text" name="email"><br /> 
		 <input type="submit"
			value="inputDetails">

	</form>
</body>
</html>