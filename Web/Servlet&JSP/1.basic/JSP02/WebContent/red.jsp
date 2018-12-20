<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>red</title>
		<style>
			img{
				border:0;
				width:70px;
				height:30px;
			}
		</style>
	</head>
	<body>
		<%
			String name = request.getParameter("name");
			String selectedColor = request.getParameter("selectedColor");
		%>
		<h2>포워딩되는 페이지 - <%=selectedColor+".jsp" %></h2>
		<b><%=name %></b>님의 좋아하는 색은 "<%=selectedColor %>"이고
		생명을 상징하는 색입니다.<br>
		<img src="image/<%=selectedColor+".jpg" %>">	
	</body>
</html>