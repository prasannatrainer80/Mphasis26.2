<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="saveemploy" modelAttribute="employ">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			Employ Name :
			<input type="text" name="name" />
			<br/><br/>
			Gender : 
			<select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select> <br/>
			<select name="dept">
				<option value="Java">Java</option>
				<option value="Dotnet">Dotnet</option>
				<option value="Angular">Angular</option>
			</select> <br/>
			Designation : 
			<select name="desig">
				<option value="Developer">Developer</option>
				<option value="TeamLead">TeamLead</option>
				<option value="Manager">Manager</option>
			</select><br/>
			Basic : 
			<input type="text" name="basic" /> <br/><br/>
			<input type="submit" value="Add Employ" />
		</center>
	</form>
</body>
</html>