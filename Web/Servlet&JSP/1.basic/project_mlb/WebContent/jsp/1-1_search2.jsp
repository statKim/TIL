<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 리스트 보기</title>
		<style>
			#mem { margin:0 auto; text-align:center; 
						 background-color:pink; margin-top:20px;}
		</style>
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
			<jsp:include page="topMenu2.jsp" flush="false"/>	
			<center>
				<h2>검색 결과</h2>
				<table width="700" border="1" bordercolor="skyblue">
					<tr>
						<table id='infotable'><tr><th>선수명</th><th>팀</th><th>승</th><th>패</th>
						<th>세이브</th><th>경기수</th><th>선발</th><th>이닝</th><th>K/9</th><th>BB/9</th>
						<th>HR/9</th><th>BABIP</th><th>LOB%</th><th>GB%</th><th>HR/HB</th><th>ERA</th>
						<th>FIP</th><th>xFIP</th><th>War</th></tr>
					</tr>
					<C:forEach var="bean" items="${v}">
						<tr>
							<td align="center">${bean.pitPlayerId}</td>
							<td align="center">${bean.pitName }</td>
							<td align="center">${bean.pitTeam }</td>
							<td align="center">${bean.pitWin }</td>
							<td align="center">${bean.pitLose }</td>
							<td align="center">${bean.pitGame }</td>
							<td align="center">${bean.pitGStart }</td>
							<td align="center">${bean.pitIP }</td>
							<td align="center">${bean.pitKper9 }</td>
							<td align="center">${bean.pitBBper9 }</td>
							<td align="center">${bean.pitHRper9 }</td>
							<td align="center">${bean.pitBABIP }</td>
							<td align="center">${bean.pitLOBper }</td>
							<td align="center">${bean.pitGBper }</td>
							<td align="center">${bean.pitHRperFB }</td>
							<td align="center">${bean.pitERA }</td>
							<td align="center">${bean.pitFIP }</td>
							<td align="center">${bean.pitxFIP }</td>
							<td align="center">${bean.pitWar }</td>
						</tr>
					</C:forEach>
				</table>
			</center>
		     <footer>
				<jsp:include page="bottomMenu2.jsp" flush="false"/>
			</footer>
		</div>	          
    </body>
</html>