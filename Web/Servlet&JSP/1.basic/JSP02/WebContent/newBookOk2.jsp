<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");

	//DB 연결
	Connection conn = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "KHSUser1";
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
	String bookNo = request.getParameter("bookNo"),
		bookName = request.getParameter("bookName"),
		bookPrice = request.getParameter("bookPrice"),
		bookDate = request.getParameter("bookDate"),
		pubNo = request.getParameter("pubNo");
	
	//member 테이블에 저장하기 위한 SQL 문 작성
	String sql = "INSERT INTO book(bookNo, bookName, bookPrice, bookDate, pubNo)";
	sql = sql + "VALUES(?,?,?,?,?)";
	
	PreparedStatement pstmt = null;
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,bookNo);
	pstmt.setString(2,bookName);
	pstmt.setString(3,bookPrice);
	pstmt.setString(4,bookDate);
	pstmt.setString(5,pubNo);
	
	try {
		pstmt.executeUpdate();	//SQL 문 실행
%>

입력이 완료되었습니다!

<%
	} catch(SQLException e) {
		e.printStackTrace();
	}
%>