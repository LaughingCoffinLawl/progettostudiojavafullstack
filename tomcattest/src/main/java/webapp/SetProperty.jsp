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
<jsp:setProperty name="user" property="firstName" value="Marco"/>
<jsp:setProperty name="user" property="lastName" value="Veglia"/>
New values has been set.
</body>
</html>