<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>if-else문 예제</title>
	</head>
	<body>
		<%-- 폼으로부터 넘어온 데이터의 한글이 깨지지 않게 처리 --%>
		<% request.setCharacterEncoding("utf-8"); %>
		
		<h2>if-else문 예제 - 좋아하는 색 선택</h2>
		
		<%-- 입력한 값을 얻어내서 처리 --%>
		<%
			String name = request.getParameter("name");	//"name"은 name 변수값
			String color = request.getParameter("color");	//"color"은 name 변수값
			
			String selectColor = "";	//지역변수 초기화
			
			if (color.equals("blue")) {	//문자열 비교
				selectColor = "파랑색";
			} else if (color.equals("green")) {
				selectColor = "초록색";
			} else if (color.equals("red")) {
				selectColor = "빨강색";
			} else {
				selectColor = "기타색";
			}		
		%>
		
		<%-- 결과 출력 --%>
		<%=name %>님이 선택한 색은 <%=selectColor %>입니다.<p>
		선택한 색 : <br>
		<img src="image/<%=color + ".jpg" %>" border="0">
	</body>
</html>