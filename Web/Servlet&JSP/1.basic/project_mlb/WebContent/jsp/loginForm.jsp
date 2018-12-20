<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 폼</title>
		<style>
			#loginBox { margin:0 auto; text-align:center; 
						 background-color:pink; margin-top:20px;}
			#loginTable { margin:0 auto; width:300px; height:150px; }
			.input { width:150px; }	
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
		<nav>
			<%-- <jsp:include page="headerAndNav2.jsp" flush="flase"/>--%>
		</nav>
		<section>
			<article>
				<div id="loginBox">
					<br><h3>LOGIN</h3><hr>
					<form method="post" action="../LoginProcess">
						<table id="loginTable">
							<tr>
								<th>아이디</th>
								<td width="30"><input type="text" id="id" name="id" class="input"></td>
							</tr>
							<tr>
								<th>비밀번호</th>
								<td><input type="password" id="password" name="password" class="input"></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input type="submit" value="로그인">
																<input type="reset" value="취소"></td>
							</tr>
						</table>
					</form>
				</div>
			</article>
		</section>
		<footer>
			<jsp:include page="bottomMenu2.jsp" flush="false"/>
			<%-- <jsp:include page="footer2.jsp" flush="false"/> --%>
		</footer>
	</div>
</body>
</html>


