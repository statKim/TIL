<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서 등록 형식</title>
	</head>
	<body>
		<h2>도서 등록</h2>
		<form method="post" action="newBookOk.jsp">	<%-- "newBookOk2.jsp : DB 저장용 --%>
			<table>
				<tr><td>도서번호 : </td><td><input type="text" id="bookNo" name="bookNo"></td></tr>
				<tr><td>도서명 : </td><td><input type="text" id="bookName" name="bookName"></td></tr>
				<tr><td>가격 : </td><td><input type="text" id="bookPrice" name="bookPrice"><br></td></tr>
				<tr><td>발행일 : </td><td><input type="text" id="bookDate" name="bookDate"><br></td></tr>
				<tr><td>출판사번호 : </td><td><input type="text" id="pubNo" name="pubNo"><br></td></tr>
				<tr><td colspan="2" align="center">
					<br>
					<input type="submit" value="완료">
					<input type="reset" value="취소">
				</td></tr>
			</table>
		</form>
	</body>
</html>