package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBUtil;

public class CrimeDayDAO {

	public static ArrayList<CrimeDayDTO> selectCrime(String crimeName) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<CrimeDayDTO> all = null;
		
		try {
			con = DBUtil.getConnection();
			all = new ArrayList<CrimeDayDTO>(); //all = new ArrayList<>();
			
			if(crimeName.equals("���¹���"))
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = '���¹���'");	
			else if(crimeName.equals("��������"))
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = '��������'");
			else if(crimeName.equals("���¹���"))
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = '���¹���'");
			else if(crimeName.equals("���ɹ���"))
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = '���ɹ���'");
			else
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = 'ǳ�ӹ���'");

			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				all.add(new CrimeDayDTO(crimeName,"sun",rset.getLong(1)));
				all.add(new CrimeDayDTO(crimeName,"mon", rset.getLong(2)));
				all.add(new CrimeDayDTO(crimeName,"tue", rset.getLong(3)));
				all.add(new CrimeDayDTO(crimeName,"wed", rset.getLong(4)));
				all.add(new CrimeDayDTO(crimeName,"thu", rset.getLong(5)));
			    all.add(new CrimeDayDTO(crimeName,"fri", rset.getLong(6)));
			    all.add(new CrimeDayDTO(crimeName,"sat", rset.getLong(7)));
			}
			
		
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}
}
