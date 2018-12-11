import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBook {
	
	Connection conn = null;
	public InsertBook() {
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
	
	public void Insert() { //book 테이블 내용 출력
		
		Scanner sc = new Scanner(System.in);
		String bookNo, bookName, bookAuthor, bookDate, pubNo;
		int bookPrice, bookStock;
		
		System.out.print("도서 번호 입력 : ");
		bookNo = sc.next();
		System.out.print("도서명 입력 : ");
		bookName = sc.next();
		System.out.print("저자 입력 : ");
		bookAuthor = sc.next();
		System.out.print("도서 가격 입력 : ");
		bookPrice = sc.nextInt();
		System.out.print("발행일 입력 : ");
		bookDate = sc.next();
		System.out.print("재고 입력 : ");
		bookStock = sc.nextInt();
		System.out.print("출판사 번호 입력 : ");
		pubNo = sc.next();
		
		String sql = "INSERT INTO book (bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo)";
		sql = sql + "VALUES(?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookNo);
			pstmt.setString(2, bookName);
			pstmt.setString(3, bookAuthor);
			pstmt.setInt(4, bookPrice);
			pstmt.setString(5, bookDate);
			pstmt.setInt(6, bookStock);
			pstmt.setString(7, pubNo);
			
			pstmt.executeUpdate();
			
			System.out.print("입력 완료!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		InsertBook ib = new InsertBook();
		ib.Insert();
	}

}
