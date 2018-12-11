package Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowMenu {
	
	Connection conn = null;
	public ShowMenu() {
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

	public void showAll(String query) { //book ���̺� ���� ���
		
		//String query = "SELECT * FROM menuList"; //SQL��
		
		try { //�����ͺ��̽��� ���� ����� �������� ����
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("=======================================================");
			System.out.println("���Ը�\t\t�޴�\t\t��ġ\t\t����");
			System.out.println("========================================================");
			
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.format("\t\t%-5s", rs.getString(2));	// - : ��������, 12: 12ĭ����, s:string
				System.out.format("\t\t%-5s", rs.getString(3));
				System.out.format("\t\t%-8s", rs.getInt(4) + "��");		// d : ����
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
		
		ShowMenu sm = new ShowMenu();
		sm.showAll("SELECT * FROM menuList");
		
	}

}
