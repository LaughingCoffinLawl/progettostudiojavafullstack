<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Properties</title>
</head>
<body>
<jsp:useBean id='user' class='jsp_beans.HelloBean' scope='session'></jsp:useBean>
First name: <jsp:getProperty property="firstName" name="user"/>
Last name:  <jsp:getProperty property="lastName" name="user"/>
</body>
</html>