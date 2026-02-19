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
	<form method="post" action="AddEmploy.jsp">
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
			<input type="submit" value="Add Employ" />
		</center>
	</form>
	<c:if test="${param.empno !=null && param.basic !=null}">
	<jsp:useBean id="employDao" class="com.java.hib.dao.EmployDaoImpl" />
	<jsp:useBean id="employ" class="com.java.hib.model.Employ" />
	<jsp:setProperty property="*" name="employ"/>
	<c:out value="${employDao.addEmploy(employ)}" />
	<jsp:forward page="EmployShow.jsp" />
	</c:if>
</body>
</html>