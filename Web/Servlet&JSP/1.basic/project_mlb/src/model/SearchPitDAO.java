package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SearchPitDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
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

	//모든 내용 반환 - Vector<SearchPitBean> 타입
	public Vector<SearchPitBean> getAllBoard(String sql) {
		Vector<SearchPitBean> v = new Vector<SearchPitBean>();
		getCon();
		
		try {
			
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); //실행 후 결과 받기
			
			while (rs.next()) {
				SearchPitBean bean = new SearchPitBean();
				
			    bean.setPitPlayerId(rs.getString(1));
			    bean.setPitName(rs.getString(2));
			    bean.setPitTeam(rs.getString(3));
			    bean.setPitWin(rs.getString(4));
			    bean.setPitLose(rs.getString(5));
			    bean.setPitGame(rs.getString(6));
			    bean.setPitGStart(rs.getString(7));
			    bean.setPitIP(rs.getString(8));
			    bean.setPitKper9(rs.getString(9));
			    bean.setPitBBper9(rs.getString(10));
			    bean.setPitHRper9(rs.getString(11));
			    bean.setPitBABIP(rs.getString(12));
			    bean.setPitLOBper(rs.getString(13));
			    bean.setPitGBper(rs.getString(14));
			    bean.setPitHRperFB(rs.getString(15));
			    bean.setPitERA(rs.getString(16));
			    bean.setPitFIP(rs.getString(17));
			    bean.setPitxFIP(rs.getString(18));
			    bean.setPitWar(rs.getString(19));
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
