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
String username = null, sessionID = null;

/* CREATION AND USE ON COOKIES
Cookie[] cookies = request.getCookies();

if(cookies != null) {
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("username")) {
			username = cookie.getValue();
		}
		if (cookie.getName().equals("JSESSIONID")) {
			sessionID = cookie.getValue();
		}
	}
}
CREATION AND USE ON COOKIES */

if (request.getSession().getAttribute("username") == null){
	response.sendRedirect("Login.jsp");
}else{
	username = request.getSession().getAttribute("username").toString();
	sessionID = request.getSession().getId();	
}
%>

Username: <%=username%> <br/>
Current Session ID: <%=sessionID%> <br/>
Member Area <br/>

<form action="<%=request.getContextPath()%>/MemberAreaController" method="get">
<input type="hidden" name="action" value="destroy">
<input type="submit" value="logoff">
</form>

</body>
