import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowBook {
	
	Connection conn = null;
	public ShowBook() {
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
	
	private void viewAll() { //book ���̺� ���� ���
		
		String query = "SELECT * FROM book"; //SQL��
		
		try { //�����ͺ��̽��� ���� ����� �������� ����
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("==========================================================================================================");
			System.out.println("NO\t\t������\t\t\t����\t\t����\t\t������\t\t���\t���ǻ��ȣ");
			System.out.println("==========================================================================================================");
			
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.format("\t\t%-13s", rs.getString(2));	// - : ��������, 12: 12ĭ����, s:string
				System.out.format("\t\t%-10s", rs.getString(3));
				System.out.format("\t\t%-8s", rs.getInt(4));		// d : ����
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
