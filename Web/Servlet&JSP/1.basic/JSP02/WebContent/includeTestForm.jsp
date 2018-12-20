<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>includeTestForm</title>
	</head>	
	<body>
		<form method="post" action="includeTest.jsp">
			이름 : <input type="text" name="name" size="10"><br><br>
			포함될 페이지 : <input type="text" name="pageName" size="20"><br><br>
			<input type="submit" value="전송">
		</form>
	</body>
</html>