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
<jsp:useBean id="user" class="jsp_beans.HelloBean" scope="page"></jsp:useBean>
${user.getFirstName()} <%--Get the method--%>
${user.firstName} <%--Get directly the variable even if it's private--%>
<c:out value="${user.lastName}"/> <%--via JSTL tags--%>

<c:if test="${param.name == 'Jhon'}"> <%--check if there's a param with the name "name" and it's equals to Jhon--%>
	Hello Jhon
</c:if>
Hello User

<%--Switch statements--%>
<c:choose>
	<c:when test="${param.lang == 'Java' }">
	  Learning Java
	</c:when>
	<c:when test="${param.lang == 'PHP' }"> 
	  Learning PHP
	</c:when>
	<c:otherwise>
	Learning something good!!
	</c:otherwise>
</c:choose>

<%--For statements--%>
<c:forEach var="i" begin="0" end="29" step="3">
${i}											
<br/>
</c:forEach>

<%--Foreach statements--%>
<%
		String[] names = new String[3];
		names[0] = "Chaand";
		names[1] = "John";
		names[2] = "Nikita";
	%>

	<c:forEach items="<%=names%>" var="name">   

		${name}
		<br />

	</c:forEach>

<%--Split statements--%>
<%
	String URL ="studyeasy.org";

%>
<c:forTokens items="<%=URL%>" delims="." var="temp">	
	${temp}
<br/>
</c:forTokens>

<%--Try&Catch statements--%>
<c:catch var="exception">
<% int x=10/0; %>
</c:catch>								
${exception.message}

<br/>
Testing......

</body>
</html>