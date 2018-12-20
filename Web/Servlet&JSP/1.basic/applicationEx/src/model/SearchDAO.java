package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SearchDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//java:comp/env
	//웹어플의 구성된 엔트리와 리소스들이 배치되어있는 부분
	//web.xml의 <resource-env-ref>에 설정한 jdbc/mysql과 매핑되는 리소스를 가져옴
	public void getCon() {
		try {
			Context initctx = new InitialContext();
			Context envctx = (Context) initctx.lookup("java:comp/env");
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//회원 등록
	public void SearchPlayer(String query) {
		getCon();

		try { //데이터베이스에 질의 결과를 가져오는 과정
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			List list = new ArrayList();
			int i = 0;
			while (rs.next()) {
				String[] arr1 = new String[18];
				arr1[0] = rs.getString(1);
				arr1[1] = rs.getString(2);	
				arr1[2] = rs.getString(3);
				arr1[3] = rs.getString(4);
				arr1[4] = rs.getString(5);	
				arr1[5] = rs.getString(6);
				arr1[6] = rs.getString(7);
				arr1[7] = rs.getString(8);	
				arr1[8] = rs.getString(9);
				arr1[9] = rs.getString(10);
				arr1[10] = rs.getString(11);	
				arr1[11] = rs.getString(12);
				arr1[12] = rs.getString(13);
				arr1[13] = rs.getString(14);	
				arr1[14] = rs.getString(15);
				arr1[15] = rs.getString(16);
				arr1[16] = rs.getString(17);	
				arr1[17] = rs.getString(18);
				arr1[18] = rs.getString(19);
				
				list.add(arr1);
				i++;
			}	
			
			rs.close();	
			pstmt.close();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}	
	
}
