<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서 정보 출력</title>
	</head>
	<body>
		<% request.setCharacterEncoding("utf-8"); %>
		<%
			String bookNo = request.getParameter("bookNo");
			String bookName = request.getParameter("bookName");
			String bookPrice = request.getParameter("bookPrice");
			String bookDate = request.getParameter("bookDate");
			String pubNo = request.getParameter("pubNo");
		%>		
		<h3>도서 정보 출력</h3>
		도서번호 : <%=bookNo %><br>
		도서명 : <%=bookName %><br>
		가격 : <%=bookPrice %><br>
		발행일 : <%=bookDate %><br>
		출판사번호 : <%=pubNo %><br>	
	</body>
</html>