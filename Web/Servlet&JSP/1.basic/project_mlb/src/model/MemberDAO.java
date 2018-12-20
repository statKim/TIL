package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

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
	public void insertMember(MemberBean bean) {
		getCon();
		
		try {
			String sql = "insert into member values (?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPassword());
			pstmt.setString(3, bean.getName());
			pstmt.setString(4, bean.getHp());
			pstmt.setString(5, bean.getAddress());
			
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//로그인 처리
	public int loginCheck (MemberBean bean) {
		getCon();
		
		String sql = "select memPass from member where memId = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  bean.getId());
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				if (rs.getString(1).equals(bean.getPassword()))
					return 1; //로그인 성공
				else
					return 0; //비밀번호 불일치
			}
			return -1; //아이디 없음
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -2; //데이터베이스 오류
	}

}	//MemberDAO 클래스 종료
