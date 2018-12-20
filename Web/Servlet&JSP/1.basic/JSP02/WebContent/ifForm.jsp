<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>if-else문 예제</title>
	</head>
	<body>
		<%-- 하나의 컴퓨터에 서버와 클라이언트가 모두 존재
			=> "http://localhost:8080/JSP02/ifForm.jsp"에서 "localhost" 자리에 다른 ip주소 쓰면
				그 ip에 해당하는 서버에 있는 jsp파일 실행됨 --%>
		<h2>if-else문 예제 - 좋아하는 색 선택</h2>
		<form method="post" action="if.jsp"> <!-- form 태그안에 있는 것만 서버로 넘어감 -->
			이름 <input id="name" name="name" type="text"
					placeholder="홍길동" autofocus required><br><br>
			색선택 <select id="color" name="color" required>
					<option value="blue" selected>파랑색
					<option value="green">초록색
					<option value="red">빨강색
					<option value="yellow">기타
				</select> <br><br>
			<input type="submit" value="확인">
		</form>
	</body>
</html>