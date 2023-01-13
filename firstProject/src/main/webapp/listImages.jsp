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

<%! String form; int fileId; %>

<form action="ImageUpload?action=listingImages" method="post" enctype="multipart/form-data">
<h1>Images</h1>
<%-- <%= request.getAttribute("images") %> SCRIVE A TESTO LE IMMAGINI STORATE NEL DATABASE --%>
<%-- itera oer tutte le immagini presenti su DB e le visualizza a schermo --%>

<table border = '1'>
<tr>
<th>Preview</th>
<th>Informations</th>
<th>Update informations</th>
<th>Action</th>
<%
	String path = (String) request.getAttribute("path");
	List<UploadImages> images = (List<UploadImages>)request.getAttribute("images");
	for (UploadImages image: images) {
		out.print("<tr><td>" +
				  "<img src="+
				  path+image.getFileName()+
				  " height = '200'/></td>");	
		out.print("<td><ul>"+
				  "<li> File ID: " + image.getId() + "</li>" +
				  "<li> File name: " + image.getFileName() + "</li>" +
				  "<li> File Label: " + image.getLabel() + "</li>" +
				  "<li> File Caption: " + image.getCaption() + "</li>" +
				  "</ul></td>");
		
		fileId = image.getId();
		 String form = "<form action='ImageUpload' method='post'>"+
	               "Label: <input type='text' name='label'/><br/><br/>"+
	               "Caption: <input type='text' name='caption'/><br/><br/>"+
	               "<input type='hidden' name='fileId' value='"+fileId+"'/>"+
	               "<input type='hidden' name='action' value='updateInformation'/>"+
	               "<input type='submit' value='Update'>"+
	               "</form>";
	               out.print( "<td>"+form+"</td></tr>");
	}
%>
</table>
</form>
</body>
</html>