package Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMenu {
	
	Connection conn = null;
	public InsertMenu() {
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
	
	public void addMenu() { 
		
		Scanner sc = new Scanner(System.in);
		String name, menu, location;
		int price;
		
		System.out.print("���Ը� �Է� : ");
		name = sc.next();
		System.out.print("�޴� �Է� : ");
		menu = sc.next();
		System.out.print("��ġ �Է� : ");
		location = sc.next();
		System.out.print("���� �Է� : ");
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
			
			System.out.print("�Է� �Ϸ�!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		InsertMenu im = new InsertMenu();
		im.addMenu();
	}

}
