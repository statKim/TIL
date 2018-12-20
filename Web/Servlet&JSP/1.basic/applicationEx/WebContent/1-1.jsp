<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>1-1 메뉴</title>
	</head>
	<body>
		<div id="wrap">
			<jsp:include page="topMenu.jsp" flush="false"/>
			<section>
				<form method="post" action="SearchProcess">				
					
				</form>
			</section>
			<footer>
				<jsp:include page="bottomMenu.jsp" flush="false"/>
			</footer>
		</div>		
	</body>
</html>