import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sqlEx {
	
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
		String info = "";
		try { //데이터베이스에 질의 결과를 가져오는 과정
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("==========================================================================================================");
			System.out.println("선수명\t\t소속팀\t\t\t저자\t\t가격\t\t발행일\t\t재고\t출판사번호");
			System.out.println("==========================================================================================================");
			
			
			while (rs.next()) {
//				System.out.print(rs.getString(1));
//				System.out.format(rs.getString(2));	// - : 왼쪽정렬, 12: 12칸배정, s:string
//				System.out.format("\t\t%-10s", rs.getString(3));
//				System.out.format("\t\t%-8s", rs.getString(4));		// d : 정수
//				System.out.format("\t%-10s", rs.getString(5));
//				System.out.format("\t%-10s", rs.getString(6));
//				System.out.format("%-5s", rs.getString(7));
//				System.out.format("\t%-10s", rs.getString(8));
//				System.out.format("\t%-10s", rs.getString(9));
//				System.out.format("%-5s", rs.getString(10));
//				System.out.format("\t%-10s", rs.getString(11));
//				System.out.format("\t%-10s", rs.getString(12));
//				System.out.format("\t%-10s", rs.getString(13));
//				System.out.format("\t%-10s", rs.getString(14));
//				System.out.format("\t%-10s", rs.getString(15));
//				System.out.format("\t%-10s", rs.getString(16));
//				System.out.format("\t%-10s", rs.getString(17));
//				System.out.format("\t%-10s", rs.getString(18));
//				System.out.format("\t%-10s", rs.getString(19));
//				System.out.format("\n");
				info = info + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5) + "\n";
				
			}
			
			rs.close();	
			pstmt.close();
			conn.close();
				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return info;
	}
	
	public static void main(String[] args) {
		//String query = "select * from pitcher2017 where pitName = 'Clayton Kershaw'";
		String query = "select * from board";
		sqlEx bc = new sqlEx();
		System.out.println(bc.viewAll(query));
	}

}
