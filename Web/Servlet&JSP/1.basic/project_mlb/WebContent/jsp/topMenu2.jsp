<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core" %>
<header>
	<div id="topMenuBox">
	<c:if test="${empty sessionScope.sid}"> <%-- sid 값이 없으면 로그인 안 된 상태 --%>
		<a href="loginForm.jsp">로그인 </a>
	</c:if>
	<c:if test="${not empty sessionScope.sid}"> <%-- sid 값이 있으면 로그인 된 상태 --%>
		${sid}님 환영합니다. |<a href="LoginProcess?command=logout">로그아웃 </a>
		| <a href="../BoardListProcess">게시판</a>
	</c:if>
		<a href="#">| 이벤트 </a>
		<a href="#">| 고객센터 </a>
		<a href="newMember.jsp">| 회원가입</a>
	</div>
</header>

<nav>
	<div id="mainMenuBox">
		<ul id="menuItem">
			<li><a href="../main.jsp"><img src="../image/logo.png" id="logoImg"></a></li>
			<li><a href="#">투수기록조회</a></li>
			<li><a href="#">타자기록조회</a></li>
			<li><a href="#">자세한 정보</a></li>
		</ul>
	</div>
	<div id="subMenuBox">
		<div class="subMenuItem" id="subMenuItem1">
			<ul>
				<li><a href="1-1.jsp">선수별 조회</a></li>
				<li><a href="2-2.jsp">기록별 조회</a></li>  			             
			</ul>
		</div>
		<div class="subMenuItem" id="subMenuItem2">
			<ul>
				<li><a href="2-1.jsp">선수별 조회</a></li>
				<li><a href="2-2.jsp">기록별 조회</a></li>      			             
			</ul>
		</div> 
		<div class="subMenuItem" id="subMenuItem3">
			<ul>
				<li><a href="https://www.mlb.com/">MLB.com</a></li>
				<li><a href="https://www.fangraphs.com">Fangraph.com</a></li>
				<li><a href="https://www.baseballamerica.com/">BaseballAmerica</a></li>
				<li><a href="https://baseballsavant.mlb.com/catch_probability_leaderboard?min=50&year=2016">
					BaseballSavant(StatCast)</a></li>   			             
			</ul>
		</div>            	               	
	</div>
</nav>

