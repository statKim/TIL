<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>성적 처리 결과</title>
	</head>
	<body>
		<% request.setCharacterEncoding("utf-8"); %>
		<%
			int korean = Integer.parseInt(request.getParameter("korean"));
			int english = Integer.parseInt(request.getParameter("english"));
			int math = Integer.parseInt(request.getParameter("math"));
			int total = korean + english + math;
			double mean = total / 3.0;
			
			//소수점 둘째자리 까지 표현
			DecimalFormat fm = new DecimalFormat("0.00");
		%>		
		<h3>성적 처리 결과</h3>
		국어 : <%=korean %><br>
		영어 : <%=english %><br>
		수학 : <%=math %>	<br>
		총점 : <%=total %><br>
		평균 : <%=fm.format(mean) %><br>
	</body>
</html>