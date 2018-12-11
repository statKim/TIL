package Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMenu {
	
	Connection conn = null;
	public InsertMenu() {
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
	
	public void addMenu() { 
		
		Scanner sc = new Scanner(System.in);
		String name, menu, location;
		int price;
		
		System.out.print("가게명 입력 : ");
		name = sc.next();
		System.out.print("메뉴 입력 : ");
		menu = sc.next();
		System.out.print("위치 입력 : ");
		location = sc.next();
		System.out.print("가격 입력 : ");
		price = sc.nextInt();

		
		String sql = "INSERT INTO menuList (name, menu, location, price)";
		sql = sql + "VALUES(?,?,?,?)";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, menu);
			pstmt.setString(3, location);
			pstmt.setInt(4, price);
			
			pstmt.executeUpdate();
			
			System.out.print("입력 완료!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		InsertMenu im = new InsertMenu();
		im.addMenu();
	}

}
