<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>GET 방식</title>
	</head>
	<body>
		<h2>로그인</h2>
		<form method="get" action="get.jsp">	<!-- get방식은 보안에 취약(url에 id,비번 다 보임) -->
			ID : <input type="text" name="id" size="10"><br><br>
			비밀번호 : <input type="password" name="pass" size="10"><br><br>
			<input type="submit" value="로그인">
			<input type="reset" value="취  소">
		</form>
	</body>
</html>