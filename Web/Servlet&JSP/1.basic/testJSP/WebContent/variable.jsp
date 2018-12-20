<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>변수 선언 예제</title>
	</head>
	<body>
		<%!
			//변수 선언과 초기화 가능
			int x = 10;
			long y;
			
			//y=100; //이 경우 오류(선언부분에서 값 지정)
			
			float floatValue = 3.14f;	//float인 경우 f 또는 F
			double doubleValue = 3.14;	//double이 기본
			
			char ch = 'a';
			String myJob = "프로그래머";
			
			boolean b = true;	//또는 false
		%>
		<%
			y = 100;	//스크립트릿에서 값 지정
		%>
		
		<h3>변수 값 출력</h3>
		x : <%= x %><br>
		y : <%= y %><br>
		floatValue : <%= floatValue %><br>
		doubleValue : <%= doubleValue %><br>
		ch : <%= ch %><br>
		myJob : <%= myJob %><br>
		b : <%= b %><br> 
	</body>
</html>