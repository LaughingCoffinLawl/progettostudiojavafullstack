<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XML Demo</title>
</head>
<body>
<c:import url="/User.xml" var="XMLFile"/>
<x:parse xml="${XMLFile}" var="XMLDoc"></x:parse>
Name: <x:out select="$XMLDoc/users/user[2]/name"/>
<br>Gender: <x:out select="$XMLDoc/users/user[3]/gender"/>
<br>Age:<x:out select="$XMLDoc/users/user[1]/age"/>

<table border=1>
	<x:forEach select="$XMLDoc/users/user">
	<tr>
		<x:if select="age > 20">
			<td><x:out select="name"/></td>
			<td><x:out select="gender"/></td>
			<td><x:out select="age"/></td>
		</x:if>
	</tr>
	</x:forEach>
</table>
</body>
</html>