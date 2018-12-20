package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBUtil;

/*
 * select SUM (time1) from crimeTimeTable
where bigClassify = '���¹���';
 * */
public class CrimeTimeDAO {
	
	public static ArrayList<CrimeTimeDTO> selectCrime(String crimeName) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<CrimeTimeDTO> all = null;
		
		try {
			con = DBUtil.getConnection();
			all = new ArrayList<CrimeTimeDTO>(); //all = new ArrayList<>();
			
			if(crimeName.equals("���¹���"))
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = '���¹���'");	
			else if(crimeName.equals("��������"))
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = '��������'");
			else if(crimeName.equals("���¹���"))
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = '���¹���'");
			else if(crimeName.equals("���ɹ���"))
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = '���ɹ���'");
			else
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = 'ǳ�ӹ���'");

			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				all.add(new CrimeTimeDTO(crimeName,"time1", rset.getLong(1)));
				all.add(new CrimeTimeDTO(crimeName,"time2", rset.getLong(2)));
				all.add(new CrimeTimeDTO(crimeName,"time3", rset.getLong(3)));
				all.add(new CrimeTimeDTO(crimeName,"time4", rset.getLong(4)));
				all.add(new CrimeTimeDTO(crimeName,"time5", rset.getLong(5)));
			    all.add(new CrimeTimeDTO(crimeName,"time6", rset.getLong(6)));
			    all.add(new CrimeTimeDTO(crimeName,"time7", rset.getLong(7)));
			    all.add(new CrimeTimeDTO(crimeName,"time8", rset.getLong(8)));
			}
			
		
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		return all;
	}
	
	
}
