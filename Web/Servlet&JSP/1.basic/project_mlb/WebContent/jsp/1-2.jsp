<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>1-2 메뉴</title>
		<link rel="stylesheet" type="text/css" href="../css/common.css">     
        <link rel="stylesheet" type="text/css" href="../css/index.css">  
        <link rel="stylesheet" type="text/css" href="../css/menu.css">
        <link rel="stylesheet" type="text/css" href="../css/slideShow.css">   
        <script src="../js/jquery-3.3.1.min.js"></script>
        <script src="../js/subMenu.js"></script>
        <script src="../js/index.js"></script>
        <script src="../js/slideShow.js"></script>
		<script src="../js/checkOption.js"></script>
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
				<form id="search" name="search" method="get" action="1-2_search.jsp">
					<table id="infotable" align="Center">
						<tr>
							<th>소속팀<input type="checkbox" id="pitTeam" value="pitTeam"></th>
							<td><input type="text" id="pitTeamVal" name="pitTeam" disabled></td>
							<th>HR/9<input type="checkbox" id="pitHRper9" value="pitHRper9"></th>
							<td><input type="text" id="pitHRper9Val" name="pitHRper9" disabled></td>														
						</tr>	
						<tr>
							<th>승<input type="checkbox" id="pitWin" value="pitWin"></th>
							<td><input type="text" id="pitWinVal" name="pitWin" disabled></td>
							<th>BABIP<input type="checkbox" id="pitBABIP" value="pitBABIP"></th>
							<td><input type="text" id="pitBABIPVal" name="pitBABIP" disabled></td>
						</tr>
						<tr>
							<th>패<input type="checkbox" id="pitLose" value="pitLose"></th>
							<td><input type="text" id="pitLoseVal" name="pitLose" disabled></td>
							<th>LOB%<input type="checkbox" id="pitLOBper" value="pitLOBper"></th>
							<td><input type="text" id="pitLOBperVal" name="pitLOBper" disabled></td>
						</tr>	
						<tr>
							<th>경기수<input type="checkbox" id="pitGame" value="pitGame"></th>
							<td><input type="text" id="pitGameVal" name="pitGame" disabled></td>
							<th>GB%<input type="checkbox" id="pitGBper" value="pitGBper"></th>
							<td><input type="text" id="pitGBperVal" name="pitGBper" disabled></td>
						</tr>
						<tr>
							<th>선발경기수<input type="checkbox" id="pitGStart" value="pitGStart"></th>
							<td><input type="text" id="pitGStartVal" name="pitGStart" disabled></td>
							<th>HR/FB<input type="checkbox" id="pitHRperFB" value="pitHRperFB"></th>
							<td><input type="text" id="pitHRperFBVal" name="pitHRperFB" disabled></td>
						</tr>
						<tr>
							<th>이닝<input type="checkbox" id="pitIP" value="pitIP"></th>
							<td><input type="text" id="pitIPVal" name="pitIP" disabled></td>
							<th>ERA<input type="checkbox" id="pitERA" value="pitERA"></th>
							<td><input type="text" id="pitERAVal" name="pitERA" disabled></td>							
						</tr>						
						<tr>
							<th>K/9<input type="checkbox" id="pitKper9" value="pitKper9"></th>
							<td><input type="text" id="pitKper9Val" name="pitKper9" disabled></td>
							<th>FIP<input type="checkbox" id="pitFIP" value="pitFIP"></th>
							<td><input type="text" id="pitFIPVal" name="pitFIP" disabled></td>
						</tr>
						<tr>
							<th>BB/9<input type="checkbox" id="pitBBper9" value="pitBBper9"></th>
							<td><input type="text" id="pitBBper9Val" name="pitBBper9" disabled></td>
							<th>xFIP<input type="checkbox" id="pitxFIP" value="pitxFIP"></th>
							<td><input type="text" id="pitxFIPVal" name="pitxFIP" disabled></td>
						</tr>	
						<tr>
							<th>War<input type="checkbox" id="pitWar" value="pitWar"></th>
							<td><input type="text" id="pitWarVal" name="pitWar" disabled></td>
							<th></th><td></td>
						</tr>			
						<tr>
							<td colspan="4" align="center">
								<input type="submit" value="검색">
							</td>
						</tr>								
					</table>					
				</form>
				<script src="../js/checkOption.js"></script>
			</section>
			
			<footer>
				<jsp:include page="bottomMenu2.jsp" flush="false"/>
			</footer>
		</div>		
	</body>
</html>