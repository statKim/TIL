package logInOut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class logIn {

	Connection conn = null;
	public logIn() {
		//데이터베이스 연결에 필요한 변수 선언 및 값 설정
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "khsUser2";
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
	
	public void enter() { //book 테이블 내용 출력
		
		Scanner sc = new Scanner(System.in);
		String id, Pw;
		boolean command = true;
		
		System.out.print("ID 입력 : ");
		id = sc.next();
		System.out.print("비밀번호 입력 : ");
		Pw = sc.next();
		
		String query = "SELECT * FROM userData"; //SQL문
		
		try { //데이터베이스에 질의 결과를 가져오는 과정
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				if (id.equals(rs.getString(1)) && Pw.equals(rs.getString(2))) {
					System.out.println("로그인 성공");
					System.out.println(id + " 님 환영합니다");
					command = false;
					break;
				}
			}
			
			if (command)
				System.out.println("로그인 실패");
			
			rs.close();	
			pstmt.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		logIn li = new logIn();
		li.enter();
	}
	
}
