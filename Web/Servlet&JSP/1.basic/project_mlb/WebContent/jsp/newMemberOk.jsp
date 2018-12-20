<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인</title>
		<link rel="stylesheet" type="text/css" href="../css/common.css">     
        <link rel="stylesheet" type="text/css" href="../css/index.css">  
        <link rel="stylesheet" type="text/css" href="../css/menu.css">
        <link rel="stylesheet" type="text/css" href="../css/slideShow.css">   
        <script src="../js/jquery-3.3.1.min.js"></script>
        <script src="../js/subMenu.js"></script>
        <script src="../js/index.js"></script>
        <script src="../js/slideShow.js"></script>
	</head>
	<body>
		<script>
			alert("회원가입에 성공하였습니다!");
		</script>
		<div id="wrap">
			<jsp:include page="topMenu2.jsp" flush="false"/>
			<section>
				<jsp:include page="middleMenu2.jsp" flush="false"/>
			</section>
			<footer>
				<jsp:include page="bottomMenu2.jsp" flush="false"/>
			</footer>
		</div>
	</body>
</html>