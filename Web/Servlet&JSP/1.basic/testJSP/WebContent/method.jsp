<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>선언문 예제 - 메소드 선언</title>
	</head>
	<body>
		<h2>선언문 예제 - 메소드 선언</h2>
		
		<%!
			String id = "abcd";
		
			public String getID() {
				return id;
			}
		%>	
		
		id 변수 : <%= id %><br>
		getID() 메소드 실행 결과 : <%= getID() %>
	</body>
</html>