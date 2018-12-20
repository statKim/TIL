<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");

	//DB 연결
	Connection conn = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "jspUser";
	String pwd = "1234";
	
	try {	//드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로드 성공");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	try {	//데이터 베이스 연결
		System.out.println("데이터베이스 연결 준비...");
		conn = DriverManager.getConnection(url, userid, pwd);
		System.out.println("데이터베이스 연결 성공");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	//전송된 데이터 변수에 저장
	String id = request.getParameter("id"),
		password = request.getParameter("pwd"),
		name = request.getParameter("name"),
		hp1 = request.getParameter("hp1"),
		hp2 = request.getParameter("hp2"),
		hp3 = request.getParameter("hp3"),
		address = request.getParameter("address");
	
	String hp = hp1 + "-" + hp2 + "-" + hp3;
	
	//member 테이블에 저장하기 위한 SQL 문 작성
	String sql = "INSERT INTO member(memID, memPass, memName, memHp, memAddress)";
	sql = sql + "VALUES(?,?,?,?,?)";
	
	PreparedStatement pstmt = null;
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,id);
	pstmt.setString(2,password);
	pstmt.setString(3,name);
	pstmt.setString(4,hp);
	pstmt.setString(5,address);
	
	try {
		pstmt.executeUpdate();	//SQL 문 실행
%>

회원가입을 축하합니다!

<%
	} catch(SQLException e) {
		e.printStackTrace();
	}
%>