<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AnotherPage</title>
</head>
<body>
<%
String URL = "<a href='http://studyeasy.org'>Home</a>";
ServletContext context = getServletContext();
context.setAttribute("url", URL);
session.setAttribute("author", "Chaand");
%>
<!--${author}  -->
${url} <%--This URL can be accessed from every new page we create--%>
</body>
</html>