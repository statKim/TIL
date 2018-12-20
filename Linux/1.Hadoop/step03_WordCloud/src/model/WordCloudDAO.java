package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.WordCloudDTO;
import util.DBUtil;

public class WordCloudDAO {
	//����ġ�� �����ϱ� ���� ��� �����͸� �˻��ؼ� ��ȯ
	/* ������ ����
	 * 	 text, frenc~ 
	 *  �������� row
	 *  ������� - text���� fre~ ȥ�� �Ұ� 
	 *  	: ��ü ������ ���� */
	
	/* ��ȯ Ÿ�� : DTO���� ������ ArryaList
	 * access modifier : ���� ���Ѿ��� public 
	 * ȣ��� DAO ��ü ���� ���� : static 
	 * parameter�� ���ʿ� 	 
	 * 
	 * ������ �������� ����� �ֿ� ����
	 * 		1. �� ������ �� ���� ����� �Ŵٶ� ����..���� �Ұ�
	 * 		2. ���� ���	
	 * 			1. ���� ����
	 * 				1. �����Ͱ� �ִ�
	 * 				2. �����Ͱ� ����
	 * 			2. ������ ����
	 * 				1. ������(exception) �߻��� �Ǿ���
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
			
			//���� ���� �˻��� ���� �������� ArrayList��ü ����
			//?�� ���� �������� �߻��� ��쿣 �ǹ̾��� ��ü�� �� ����°� ���� ����
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



