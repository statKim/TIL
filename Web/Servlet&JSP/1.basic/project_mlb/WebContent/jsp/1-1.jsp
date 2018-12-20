<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>1-1 메뉴</title>
		<link rel="stylesheet" type="text/css" href="../css/common.css">     
        <link rel="stylesheet" type="text/css" href="../css/index.css">  
        <link rel="stylesheet" type="text/css" href="../css/menu.css">
        <link rel="stylesheet" type="text/css" href="../css/slideShow.css">   
        <script src="../js/jquery-3.3.1.min.js"></script>
        <script src="../js/subMenu.js"></script>
        <script src="../js/index.js"></script>
        <script src="../js/slideShow.js"></script>
        <style>
        	#infotable {
				text-align:center; 

			}
        </style>
	</head>
	<body>
		<div id="wrap">
			<jsp:include page="topMenu2.jsp" flush="false"/>
			
			<section>
				<form id="searchPit" name="searchPit" method="get" action="../SearchPitProcess">
					<div align="center">
						선수명 입력 : <input type="text" id="plyName" name="plyName">
						<input type="submit" value="검색">
					</div>					
				</form>
			</section>
			
			<footer>
				<jsp:include page="bottomMenu2.jsp" flush="false"/>
			</footer>
		</div>		
	</body>
</html>