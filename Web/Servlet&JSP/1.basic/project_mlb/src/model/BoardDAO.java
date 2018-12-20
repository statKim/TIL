package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {

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
	
	//모든 내용 반환 - Vector<BoardBean> 타입
	public Vector<BoardBean> getAllBoard() {
		Vector<BoardBean> v = new Vector<BoardBean>();
		getCon();
		
		try {
			String sql = "select * from board order by bbsNum desc";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); //실행 후 결과 받기
			
			while (rs.next()) {
				BoardBean bean = new BoardBean();
				bean.setBbsNum(rs.getInt(1));
				bean.setBbsWriter(rs.getString(2));
				bean.setBbsSubject(rs.getString(3));
				bean.setBbsContent(rs.getString(4));
				bean.setBbsDate(rs.getString(5).toString());
				
				//패키징한 데이터를 벡터에 저장
				v.add(bean);
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}

	
}
	
	
