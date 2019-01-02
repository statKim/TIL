package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BookDAO {

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
	public void insertBook(BookBean bean) {
		getCon();
		
		try {
			String sql = "insert into book values (?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getBookNo());
			pstmt.setString(2, bean.getBookName());
			pstmt.setString(3, bean.getBookPrice());
			pstmt.setString(4, bean.getBookDate());
			pstmt.setString(5, bean.getPubNo());
			
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}