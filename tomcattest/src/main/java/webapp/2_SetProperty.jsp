<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Set Properties</title>
</head>
<body>
<jsp:useBean id='user' class='jsp_beans.HelloBean' scope='session'></jsp:useBean>

<%-- Old project without forms --%>

<%-- <jsp:setProperty name="user" property="firstName" value="Marco"/>
<jsp:setProperty name="user" property="lastName" value="Veglia"/>
New values has been set. --%>

<form action="2_GetProperty.jsp" method="post">
First Name: <input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="user"/>'><br/>
Last Name: <input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="user"/>'><br/>
<input type="submit" value="submit">
</form>
</body>
</html>