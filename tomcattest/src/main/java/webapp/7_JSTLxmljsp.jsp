<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="x" 
           uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XML Demo</title>
</head>
<body>
<c:import url="/7_User.xml" var="XMLFile"/>
<x:parse xml="${XMLFile}" var="XMLDoc"></x:parse>
Name: <x:out select="$XMLDoc/users/user[2]/name"/>
<br>Gender: <x:out select="$XMLDoc/users/user[3]/gender"/>
<br>Age:<x:out select="$XMLDoc/users/user[1]/age"/>

<table border=1>
	<x:forEach select="$XMLDoc/users/user">
	<tr>
	<%-- 
		<x:if select="age > 16">
			<td><x:out select="name"/></td>
			<td><x:out select="gender"/></td>     IF VARIANT
			<td><x:out select="age"/></td>
		</x:if> --%>
	<x:choose>
		<x:when select="gender='Female'">	
			<td><i><b><x:out select="name" /></b></i></td>
			<td><i><b><x:out select="gender" /></b></i></td>
			<td><i><b><x:out select="age" /></b></i></td>
		</x:when>
	<x:otherwise>
		<td><x:out select="name" /></td>
		<td><x:out select="gender" /></td>
		<td><x:out select="age" /></td>
	</x:otherwise>
	</x:choose>
	</tr>
	</x:forEach>
</table>
</body>
</html>