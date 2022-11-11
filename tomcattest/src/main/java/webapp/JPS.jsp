<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<%--This is for a page change with multiple file--%>
<%--<form action="Submit.jsp" method="post">--%> 
<form action="<%=request.getContextPath()%>/Main" method="post"> <%--"get" will display informations on the URL --%>
	Full name: <input type="text" name= "name" required><br/>
	Gender: <input type="radio" name="gender" value ="male" checked = checked> Male
			<input type="radio" name="gender" value ="female"> Female <br/>
	Language known: <input type="checkbox" name="language" value="english"> English
				   <input type="checkbox" name="language" value="italian"> Italian
				   <input type="checkbox" name="language" value="french"> French <br/>
	Country: <select name="country">
			 <option value="italy">Italy</option>
			 <option value="USA">USA</option>
			 <option value="France">France</option>
			 <option value="Belgium">Belgium</option>
			 <option value="Germany">Germany</option>
	</select><br/>
	<input type="submit" value="Submit">
</form>
</body>
</html>