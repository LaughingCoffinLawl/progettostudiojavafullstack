<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Demo</title>
</head>
<body>
<c:set var="name" value="Marco"></c:set>
<c:out value="${name}"></c:out>
</body>
</html>