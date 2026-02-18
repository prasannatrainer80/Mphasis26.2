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
	<form method="get" action="Customer.jsp">
		<center>
			Customer Id : 
		<input type='number' name="custId" /> <br/><br/>
			Customer Name : 
		<input type="text" name="custName" /> <br/><br/>
			Bill Amount : 
		<input type="number" name="billAmount" /> <br/><br/>
		<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.custId !=null && param.billAmount !=null}">
		<jsp:useBean id="beanCustomer" class="com.java.jstl.Customer" />
		<jsp:setProperty property="*" name="beanCustomer"/>
		Customer Id : 
		<jsp:getProperty property="custId" name="beanCustomer"/> <br/>
		Customer Name : 
		<jsp:getProperty property="custName" name="beanCustomer"/> <br/>
		Bill Amount : 
		<jsp:getProperty property="billAmount" name="beanCustomer"/>
	</c:if>
</body>
</html>