<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>선언문과 스크립트릿에서 선언된 변수의 차이</title>
	</head>
	<body>
		<h2>선언문과 스크립트릿에서 선언된 변수의 차이</h2>
		<%= str1 %><br>
		<%-- <%= str2 %>  지역변수 => 선언 전에 사용하면 에러뜸 --%>
		
		<%!
			String str1 = "선언문에서 선언한 변수";	//멤버변수(전역변수) => 나중에 선언되도 사용가능!
		%>
		
		<%
			String str2 = "스크립트릿에서 선언한 변수";	//지역변수 => 선언 전에 사용하면 에러뜸
		%>
		
		<%= str1 %><br>
		<%= str2 %>
	</body>
</html>