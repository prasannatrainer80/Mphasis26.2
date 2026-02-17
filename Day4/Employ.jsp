<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanEmploy" class="com.java.jsp.Employ" />
<jsp:setProperty property="*" name="beanEmploy"/>
Employ No : 
<b>
<jsp:getProperty property="empno" name="beanEmploy"/>
</b> <br/>
Employ Name : 
<b>
<jsp:getProperty property="name" name="beanEmploy"/>
</b> <br/>
Gender : 
<b>
<jsp:getProperty property="gender" name="beanEmploy"/>
</b> <br/>
Department : 
<b>
<jsp:getProperty property="dept" name="beanEmploy"/>
</b> <br/>
Designation : 
<b>
<jsp:getProperty property="desig" name="beanEmploy"/>
</b> <br/>
Basic : 
<b>
<jsp:getProperty property="basic" name="beanEmploy"/>
</b> <br/>

</body>
</html>