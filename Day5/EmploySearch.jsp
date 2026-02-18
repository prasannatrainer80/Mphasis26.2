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
	<form method='get' action="EmploySearch.jsp">
		<center>
			Employ No : 
		<input type="number" name="empno" /> <br/><br/>
		<input type="submit" value="Search" />
		</center>
	</form>
	<c:if test="${param.empno !=null}">
		<c:set var="empno" value="${param.empno}" />
		<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver" 
		url="jdbc:mysql://localhost:3306/Mphasis26"
		user="root" 
		password="root"
	/>
	<sql:query var="employQuery" dataSource="${conn}">
		select * from Employ where empno = ? 
		<sql:param value="${empno}" />
	</sql:query>
	<c:set var="flag" value="false" />
	<c:forEach var="employ" items="${employQuery.rows}">
		Employ No : 
		<c:out value="${employ.empno}" /> <br/>
		Employ Name : 
		<c:out value="${employ.name}" /> <br/>
		Gender : 
		<c:out value="${employ.gender}" /> <br/>
		Department :
		<c:out value="${employ.dept}" /> <br/>
		Designation : 
		<c:out value="${employ.desig}" /> <br/>
		Basic : 
		<c:out value="${employ.basic}" /> <br/><hr/>
		<c:set var="flag" value="true" />
	</c:forEach>
	<c:if test="${flag==false}">
		<c:out value="Record Not Found..." />
	</c:if>
	</c:if>
</body>
</html>