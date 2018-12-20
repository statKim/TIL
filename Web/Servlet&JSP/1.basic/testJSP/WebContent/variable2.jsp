<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>선언문 예제2 - 변수선언</title>
	</head>
	<body>
		<h2>선언문 예제 - 변수 선언</h2>
		<%	//str2 변수를 나중에 선언했지만 사용 가능
			String str1 = "ID : " + str2;	//문자열 결합
		%>
		
		<%!	//전역변수 str2 선언
			String str2 = "abcd";
		%>
		
		결과 : <%= str1 %>
	</body>
</html>