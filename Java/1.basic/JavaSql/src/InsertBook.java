import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBook {
	
	Connection conn = null;
	public InsertBook() {
		//�����ͺ��̽� ���ῡ �ʿ��� ���� ���� �� �� ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "khsUser2";
		String pwd = "1234";
		
		try { //����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try { //�����ͺ��̽� ����
			System.out.println("�����ͺ��̽� ���� �غ�...");
			conn = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Insert() { //book ���̺� ���� ���
		
		Scanner sc = new Scanner(System.in);
		String bookNo, bookName, bookAuthor, bookDate, pubNo;
		int bookPrice, bookStock;
		
		System.out.print("���� ��ȣ �Է� : ");
		bookNo = sc.next();
		System.out.print("������ �Է� : ");
		bookName = sc.next();
		System.out.print("���� �Է� : ");
		bookAuthor = sc.next();
		System.out.print("���� ���� �Է� : ");
		bookPrice = sc.nextInt();
		System.out.print("������ �Է� : ");
		bookDate = sc.next();
		System.out.print("��� �Է� : ");
		bookStock = sc.nextInt();
		System.out.print("���ǻ� ��ȣ �Է� : ");
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
			
			System.out.print("�Է� �Ϸ�!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		InsertBook ib = new InsertBook();
		ib.Insert();
	}

}
