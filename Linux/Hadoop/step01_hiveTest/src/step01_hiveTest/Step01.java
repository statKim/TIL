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
		
		//jdbc 뒤쪽은 제시하는 방법대로 그대로 해야함!!(ex-hive or 
		Connection con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/default","","");
		Statement stmt = con.createStatement();	//Statement 객체 생성
		ResultSet res = stmt.executeQuery("SELECT * FROM person");
		// preparedStatement로 해도 가능(약간 형식이 다를뿐.. Statement는 객체 자체가 쿼리문 전달 못함..)
//		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM person");
//		ResultSet res = pstmt.executeQuery();
		while (res.next()) {
			System.out.println(res.getString(1) + " " + res.getString(2));
		}
		con.close();
	}

}
