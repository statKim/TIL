<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생 정보 등록 완료</title>
	</head>
	<body>
		<%-- 한글 제대로 서버에 저장하려면 인코딩 해줘야함
			 => 인코딩해줘야 제대로 출력할 수 있음 --%>
		<% request.setCharacterEncoding("utf-8"); %>
		<h2>학생 정보 등록 완료</h2>
		
		<%
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String hp1 = request.getParameter("hp1");
			String hp2 = request.getParameter("hp2");
			String hp3 = request.getParameter("hp3");
			String year = request.getParameter("year");
			String department = request.getParameter("department");
			
			//여기서 핸드폰 번호 합치고 해도 됨
			//String hp = hp1 + "-" + hp2 + "-" + hp3;
		%>		
		<h3>학번 : <%=id %></h3>
		<h3>이름 : <%=name %></h3>
		<h3>연락처 : <%=hp1 + "-" + hp2 + "-" + hp3 %></h3>	<!-- DB 저장할 때 이런식으로 결합해서 저장해야함!!! -->
		<h3>학년 : <%=year %></h3>
		<h3>학과 : <%=department %></h3>
	</body>
</html>