package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.domain.CustomerDTO;
import util.DBUtil;

public class CustomerDAO {
	
	/* 실행시 발생 가능한 경우의 수 
	 * 1. 정상 실행
	 * 		- 데이터들이 존재
	 * 			- 개별 고객 정보를 DTO로 생성해서 ArrayList
	 * 		- 데이터들 미 존재
	 * 2. 비정상 실행
	 * 		- 예외 발생 */
	public static ArrayList<CustomerDTO> selectAll() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<CustomerDTO> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from customer");
			rset = pstmt.executeQuery();

			all = new ArrayList<>();
		
			while(rset.next()) {
				all.add(new CustomerDTO(rset.getString(1), 
														  rset.getString(2), 
														  rset.getString(3)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}
	
	
	
	/* 로그인 체크 로직
	 * 1. 반환 - 로그인 성공인 경우 검색된 이름을 반환
	 * 2. 고려해야할 상황
	 * 		경우의 수 1 - 정상 실행
	 * 			- 존재할 경우 = String이름 값 반환
	 * 			- 미존재할 경우 = null값 반환
	 * 		경우의 수 2 - 비정상 실행
	 * 			- 예외 발생 	 */
	public static String loginCheck(String id, String pw) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String name = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select name from customer where id=? and pw=?");
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				name = rset.getString(1);
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return name;
	}
	
	public static boolean update(String id, String newName) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		boolean result = false;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("update customer set name=? where id=?");
			
			pstmt.setString(1, newName);
			pstmt.setString(2, id);
			
			int r = pstmt.executeUpdate();//insert.update.delete 실행
			
			if(r != 0) {
				result = true;
			}
		}finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	}
	
}







