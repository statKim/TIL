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
		<div id="wrap">
			<jsp:include page="topMenu2.jsp" flush="false"/>	
			<center>
				<h2>전체 게시글 보기</h2>
				<table width="700" border="1" bordercolor="skyblue">
					<tr height="40">
						<td colspan="5" align="right">
							<button onclick="location.href=boardWriteForm.jsp">글쓰기</button>
						</td>
					</tr>
					<tr>
						<th>번호</th><th>작성자</th><th>제목</th><th>작성일</th>
					</tr>
					<C:forEach var="bean" items="${v}">
						<tr>
							<td align="center"><a href="">${bean.bbsNum}</a></td>
							<td align="center">${bean.bbsWriter }</td>
							<td>${bean.bbsSubject }</td>
							<td align="center">${bean.bbsDate }</td>
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