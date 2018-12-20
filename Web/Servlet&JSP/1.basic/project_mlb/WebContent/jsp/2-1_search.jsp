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
			
			<h2 align="center">검색 결과</h2><hr>
			<section>
				<form id="2-1" name="2-1">
	
					<%-- 클래스 정의!! --%>
					<%@  page import="java.sql.Connection" %>
					<%@  page import="java.sql.DriverManager" %>
					<%@  page import="java.sql.PreparedStatement" %>
					<%@  page import="java.sql.ResultSet" %>
					<%@  page import="java.sql.SQLException" %>				
					<%!
					String name;
					public class sqlEx {
						String name;
						Connection conn = null;
						public sqlEx() {
							//데이터베이스 연결에 필요한 변수 선언 및 값 설정
							String url = "jdbc:oracle:thin:@localhost:1521:xe";
							String userid = "khsproject";
							String pwd = "1234";
							
							try { //드라이버 로드
								Class.forName("oracle.jdbc.driver.OracleDriver");
								System.out.println("드라이버 로드 성공");
							} catch (ClassNotFoundException e) {
								e.printStackTrace();
							}
							
							try { //데이터베이스 연결
								System.out.println("데이터베이스 연결 준비...");
								conn = DriverManager.getConnection(url, userid, pwd);
								System.out.println("데이터베이스 연결 성공");
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
						
						private String viewAll(String query) { //book 테이블 내용 출력
							
							//String query = "SELECT * FROM pitcher2017 where cast(pitWin as float) > 10"; //SQL문
							String info = "<table id='infotable'>";
							info = info + "<tr><th>선수명</th><th>팀</th><th>경기수</th><th>타수</th><th>홈런</th><th>득점</th><th>타점</th><th>도루</th><th>BB%</th><th>K%</th><th>ISO</th>";
							info = info + "<th>BABIP</th><th>타율</th><th>출루율</th><th>장타율</th><th>OPS</th><th>wOBA</th><th>wRC+</th><th>War</th></tr>";
							
							try { //데이터베이스에 질의 결과를 가져오는 과정
								PreparedStatement pstmt = conn.prepareStatement(query);
								ResultSet rs = pstmt.executeQuery();						
								
								while (rs.next()) {
									
									info = info + "<tr><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)+ "</td><td>" + rs.getString(4) 
									+ "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(6) + "</td><td>" + rs.getString(7)
									+ "</td><td>" + rs.getString(8) + "</td><td>" + rs.getString(9) + "</td><td>" + rs.getString(10)
									+ "</td><td>" + rs.getString(11) + "</td><td>" + rs.getString(12) + "</td><td>" + rs.getString(13)
									+ "</td><td>" + rs.getString(14) + "</td><td>" + rs.getString(15) + "</td><td>" + rs.getString(16)
									+ "</td><td>" + rs.getString(17) + "</td><td>" + rs.getString(18) + "</td><td>" + rs.getString(19)
									+ "</td><td>" + rs.getString(20) + "</td></tr>";	
								}
								info = info + "</table>";
								
								rs.close();	
								pstmt.close();
								conn.close();
									
							} catch(SQLException e) {
								e.printStackTrace();
							}
							return info;
						}
					}
					%>

					<%
					String name = request.getParameter("plyName");
					//name="Trout";
					//String query = "SELECT * FROM pitcher2017 where cast(pitWin as float) > 15";
					String query = "select * from hitter2017 where hitName like '%" + name + "%'";
					System.out.println(query);
					sqlEx bc = new sqlEx();
					String a = bc.viewAll(query);
					
					%>
					<%=a %>
				</form>
			</section>
			
			
			<footer>
				<jsp:include page="bottomMenu2.jsp" flush="false"/>
			</footer>
		</div>		
	</body>
</html>