<%@ page language="java" contentType="UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="x"  uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>I18N Demo</title>
</head>
<body>
View website in:
<a href="?Locale=en-US">English(US)</a>
<a href="?Locale=es-AR">Argentina</a>
<a href="?Locale=ru-RU">Russia</a>
<a href="?Locale=hi-IN">India</a>
<br>
<br>
<fmt:setLocale value="${param.Locale}"/>

<p><fmt:bundle basename="i18n/website">
	<p><fmt:message key="label.hello"/>
	<p><fmt:message key="label.welcome"/>
	<p><fmt:message key="label.thank"/>
<p></fmt:bundle>
Locale: ${param.Locale}
</body>
</html>