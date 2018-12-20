<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>성적 구하기</title>
	</head>
	<body>
        <h2>성적 구하기</h2>
        <form id="scoreForm" name="scoreForm" method="post" action="scoreResult.jsp">
			국어 : <input type="text" id="korean" name="korean" size="10"><br>
			영어 : <input type="text" id="english" name="english" size="10"><br>
			수학 : <input type="text" id="math" name="math" size="10"><br><br>
			<input type="submit" value="확인">
			<input type="reset" value="취소">
    	</form>		
	</body>
</html>