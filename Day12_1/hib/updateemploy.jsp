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
	<c:set var="empno" value="${param.empno}" />
	<jsp:useBean id="beanHelper" class="com.java.hib.ContextHelper" />
	<c:set var="dao" value="${beanHelper.getSession()}" />
	<c:set var="employ" value="${dao.getEmploy(empno)}" />
	<form method="get" action="updateemploy.jsp">
	<center>
		Employ No : 
		<input type="text" name="empno" value="${employ.empno}" /> 
		<br/><br/>
		Employ Name : 
		<input type="text" name="name" value="${employ.name}" /> 
		<br/><br/>
		Gender : 
		<input type="text" name="gender" value="${employ.gender}" /> 
		<br/><br/>
		Department : 
		<input type="text" name="dept" value="${employ.dept}" /> 
		<br/><br/>
		Designation : 
		<input type="text" name="desig" value="${employ.desig}" /> 
		<br/><br/>
		Basic : 
		<input type="number" name="basic" value="${employ.basic}" /> 
		<br/><br/>
		<input type="submit" value="Update" />
	</center>
	</form>
	<c:if test="${param.empno !=null && param.basic !=null}">
		<jsp:useBean id="employUpdate" class="com.java.hib.Employ" />
		<jsp:setProperty property="*" name="employUpdate"/>
		<c:set var="result" value="${dao.updateEmploy(employUpdate)}" />
		<jsp:forward page="EmployShow.jsp" />
	</c:if>
</body>
</html>