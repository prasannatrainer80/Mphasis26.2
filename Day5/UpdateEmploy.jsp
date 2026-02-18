<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="UpdateEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/>
			Employ Name :
			<input type="text" name="name" /> <br/>
			Gender : 
			<select name="gender">
				<option value="MALE">MALE</option> 
				<option value="FEMALE">FEMALE</option>
			</select> <Br/>
			Department : 
			<select name="dept">
				<option value="Dotnet">Dotnet</option>
				<option value="Java">Java</option>
				<option value="Sql">Sql</option>
			</select> <br/>
			Designation : 
			<select name="desig">
				<option value="Developer">Developer</option>
				<option value="TeamLead">TeamLead</option>
				<option value="Manager">Manager</option>
			</select> <Br/>
			Basic : 
			<input type="number" name="basic" />
			<input type="submit" value="Update Employ" />
		</center>
	</form>
	<c:if test="${param.empno !=null && param.basic !=null}">
		<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver" 
		url="jdbc:mysql://localhost:3306/Mphasis26"
		user="root" 
		password="root"
	/>
	<sql:update var="employUpdate" dataSource="${conn}">
		update employ set name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? WHERE Empno = ?
		<sql:param value="${param.name}" />
		<sql:param value="${param.gender}" />
		<sql:param value="${param.dept}" />
		<sql:param value="${param.desig}" />
		<sql:param value="${param.basic}" />
		<sql:param value="${param.empno}" />
	</sql:update>
	<c:out value="Employ Record Updated..." />
	</c:if>
</body>
</html>