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
	
	public void enter() { //book ���̺� ���� ���
		
		Scanner sc = new Scanner(System.in);
		String id, Pw;
		boolean command = true;
		
		System.out.print("ID �Է� : ");
		id = sc.next();
		System.out.print("��й�ȣ �Է� : ");
		Pw = sc.next();
		
		String query = "SELECT * FROM userData"; //SQL��
		
		try { //�����ͺ��̽��� ���� ����� �������� ����
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				if (id.equals(rs.getString(1)) && Pw.equals(rs.getString(2))) {
					System.out.println("�α��� ����");
					System.out.println(id + " �� ȯ���մϴ�");
					command = false;
					break;
				}
			}
			
			if (command)
				System.out.println("�α��� ����");
			
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
