package step01_hiveTest;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Step01 {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("org.apache.hive.jdbc.HiveDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//jdbc ������ �����ϴ� ������ �״�� �ؾ���!!(ex-hive or 
		Connection con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/default","","");
		Statement stmt = con.createStatement();	//Statement ��ü ����
		ResultSet res = stmt.executeQuery("SELECT * FROM person");
		// preparedStatement�� �ص� ����(�ణ ������ �ٸ���.. Statement�� ��ü ��ü�� ������ ���� ����..)
//		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM person");
//		ResultSet res = pstmt.executeQuery();
		while (res.next()) {
			System.out.println(res.getString(1) + " " + res.getString(2));
		}
		con.close();
	}

}
