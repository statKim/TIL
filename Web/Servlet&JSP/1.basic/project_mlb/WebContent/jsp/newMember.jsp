<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
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
			<div id="mem">
		       <h1>★ 회원 가입 ★</h1>
		       <form id="newMemberForm" name="newMemberForm" method="post" action="../NewMemberProcess">
		          <table>
		            <tr><th>ID</th><td><input type="text" id="id" name="id"></td></tr>
		            <tr><th>비밀번호</th><td><input type="password" id="pwd" name="pwd"></td></tr>
		            <tr><th>성명</th><td><input type="text" id="name" name="name"></td></tr>
		            <tr><th>휴대폰 번호</th><td><input type="text" id="hp1" name="hp1" size="3"> 
		                    - <input type="text" id="hp2" name="hp2" size="4">
		                    - <input type="text" id="hp3" name="hp3" size="4"></td></tr>   
		            <tr><th>주소</th><td><input type="text" id="address" name="address" size="30"></td></tr>        
		            <tr>
		                <td colspan="2" align="center">
		                    <br>
		                    <input type="submit" value="가입">
		                    <input type="reset" value="취소">
		                </td>
		            </tr>             
				</table>
		      </form>
	      	</div>
	     <footer>
			<jsp:include page="bottomMenu2.jsp" flush="false"/>
		</footer>
		</div>	          
    </body>
</html>