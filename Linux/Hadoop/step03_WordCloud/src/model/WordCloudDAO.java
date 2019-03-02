package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.WordCloudDTO;
import util.DBUtil;

public class WordCloudDAO {
	//가중치를 적용하기 위해 모든 데이터를 검색해서 반환
	/* 데이터 구조
	 * 	 text, frenc~ 
	 *  여러개의 row
	 *  고려사항 - text값과 fre~ 혼용 불가 
	 *  	: 객체 단위로 생성 */
	
	/* 반환 타입 : DTO들을 보유한 ArryaList
	 * access modifier : 접근 제한없는 public 
	 * 호출시 DAO 객체 생성 금지 : static 
	 * parameter는 불필요 	 
	 * 
	 * 개발자 관점에서 고려한 주요 사항
	 * 		1. 이 로직이 늘 정상 실행될 거다란 보장..절대 불가
	 * 		2. 실행 결과	
	 * 			1. 정상 실행
	 * 				1. 데이터가 있다
	 * 				2. 데이터가 없다
	 * 			2. 비정상 실행
	 * 				1. 문제가(exception) 발생이 되었다
	 * */
	public static ArrayList<WordCloudDTO> getAll() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<WordCloudDTO> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from wordcloud");
			rset = pstmt.executeQuery();
			
			//문제 없이 검색된 직후 실질적인 ArrayList객체 생성
			//?왜 접속 문제등이 발생될 경우엔 의미없는 객체는 안 만드는게 좋기 때문
			all = new ArrayList<>();
			while(rset.next()) {
				all.add(new WordCloudDTO(rset.getString(1), rset.getInt(2)));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
}



