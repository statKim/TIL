<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>GET 방식</title>
	</head>
	<body>
		<%
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
		%>		
		<h3><%=id %>님 환영합니다!!</h3>
	</body>
</html>