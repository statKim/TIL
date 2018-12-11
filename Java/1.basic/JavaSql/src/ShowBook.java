import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowBook {
	
	Connection conn = null;
	public ShowBook() {
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
	
	private void viewAll() { //book 테이블 내용 출력
		
		String query = "SELECT * FROM book"; //SQL문
		
		try { //데이터베이스에 질의 결과를 가져오는 과정
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("==========================================================================================================");
			System.out.println("NO\t\t도서명\t\t\t저자\t\t가격\t\t발행일\t\t재고\t출판사번호");
			System.out.println("==========================================================================================================");
			
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.format("\t\t%-13s", rs.getString(2));	// - : 왼쪽정렬, 12: 12칸배정, s:string
				System.out.format("\t\t%-10s", rs.getString(3));
				System.out.format("\t\t%-8s", rs.getInt(4));		// d : 정수
				System.out.format("\t%-10s", rs.getDate(5));
				System.out.format("\t%-10s", rs.getInt(6));
				System.out.format("%-5s", rs.getString(7));
				System.out.format("\n");
			}
			
			rs.close();	
			pstmt.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ShowBook bc = new ShowBook();
		bc.viewAll();
	}

}
