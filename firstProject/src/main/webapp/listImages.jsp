<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="entities.UploadImages" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns='http://www.w3.org/1999/xhtml'>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listing Images</title>
</head>
<body>
<form action="ImageUpload?action=listingImages" method="post" enctype="multipart/form-data">
Images
<%-- <%= request.getAttribute("images") %> SCRIVE A TESTO LE IMMAGINI STORATE NEL DATABASE --%>
<%
	String path = (String) request.getAttribute("path");
	List<UploadImages> images = (List<UploadImages>)request.getAttribute("images");
	for (UploadImages image: images) {
		out.print("<br/><img src="+path+image.getFileName()+" />");
	}
%>
</form>
</body>
</html>