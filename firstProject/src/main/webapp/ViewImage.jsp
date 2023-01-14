<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="entities.UploadImages" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Image</title>
</head>
<body>
<%!
	UploadImages image; String path;
%>
<%
	image = (UploadImages)request.getAttribute("image");
	path = (String)request.getAttribute("path");
%>
File ID: <%= image.getId() %> | File name: <%= image.getFileName() %> |
<%
	if (image.getLabel() != null) {
		out.print("Label : " + image.getLabel()); 
	}
%>
|
<%
	if (image.getLabel() != null) {
		out.print("Caption : " + image.getCaption());
	}
%>
| <a href="${pageContext.request.contextPath}">Home</a>
| <a href="${pageContext.request.contextPath}/ImageUpload?action=listingImages">List avaiable images</a>
<hr/>
<img src="<%=path+image.getFileName() %>">
</body>
</html>