<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Area</title>
</head>
<body>
<%
String username = "", sessionID = "";
Cookie[] cookies = request.getCookies();

if(cookies != null) {
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("username")) {
			username = cookie.getValue();
		}
		if (cookie.getName().equals("JSESSIONID"));
		sessionID = cookie.getValue();
	}
}

if(sessionID == null || username == null) {
	response.sendRedirect("Login.jsp");
} %>

Username: <%=username%> <br/>
Current Session ID: <%=sessionID%> <br/>
Member Area <br/>

</body>
