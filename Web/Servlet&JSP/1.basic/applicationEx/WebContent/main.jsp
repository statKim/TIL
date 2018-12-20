<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/common.css">     
        <link rel="stylesheet" type="text/css" href="css/index.css">  
        <link rel="stylesheet" type="text/css" href="css/menu.css">
        <link rel="stylesheet" type="text/css" href="css/slideShow.css">   
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/subMenu.js"></script>
        <script src="js/index.js"></script>
        <script src="js/slideShow.js"></script>
	</head>
	<body>
		<div id="wrap">
			<jsp:include page="topMenu.jsp" flush="false"/>
			<section>
				<jsp:include page="middleMenu.jsp" flush="false"/>
			</section>
			<footer>
				<jsp:include page="bottomMenu.jsp" flush="false"/>
			</footer>
		</div>
	</body>
</html>