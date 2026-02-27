<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="updatefinal" modelAttribute="employ">
		<center>
			Employ No : 
			<input type="number" name="empno" value=${employ.empno} />
			<br/>
			Employ Name : 
			<input type="text" name="name" value=${employ.name} />
			<br/>
			Gender : 
			<input type="text" name="gender" value=${employ.gender} />
			<br/>
			Department : 
			<input type="text" name="dept" value=${employ.dept} />
			<br/>
			Designation : 
			<input type="text" name="desig" value=${employ.desig} />
			<br/>
			Basic : 
			<input type="number" name="basic" value=${employ.basic} />
			<br/>
			<input type="submit" value="Update" />
		</center>
		
	</form>
</body>
</html>