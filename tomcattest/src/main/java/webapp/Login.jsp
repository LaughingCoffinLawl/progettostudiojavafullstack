<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/ServletSession" method="post">
Username: <input type="text" name="username"></br>
PassworD: <input type="password" name="password" value=""></br>
<input type="submit" value="submit">
</form>
</body>
</html>