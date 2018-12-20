<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forwardParamForm</title>
	</head>
	<body>
		<h2>포워딩될 페이지에 파라미터값 전달 예제</h2>
		<form method="post" action="forwardParamTo.jsp">
			이름 <input id="name" name="name" type="text"
						placeholder="홍길동" autofocus required><br><br>
			색선택 <select id="color" name="color" required>
					<option value="blue" selected>파랑색
					<option value="green">초록색
					<option value="red">빨강색
					<option value="yellow">노랑색
				</select> <br><br>
			
			<input type="submit" value="확인">
		</form>
	</body>
</html>