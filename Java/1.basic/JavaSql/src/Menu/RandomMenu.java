package Menu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


// ShowMenu로부터 상속받음
public class RandomMenu extends ShowMenu {

	public RandomMenu() {
		super();
	}	
		
	public void choiceMenu() { 
		
		String query = "SELECT name FROM menuList";
		
		List<String> menuList = new ArrayList<String>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
				
			while (rs.next()) {
				menuList.add(rs.getString(1));
			}
			rs.close();	
			pstmt.close();
//			conn.close();	// 닫으면 sql 에러남
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		Random r = new Random();
		int x = r.nextInt(menuList.size());
		String selection = menuList.get(x);
	
		query = "SELECT * FROM menuList WHERE name = '" + selection + "'"; //SQL문

		System.out.println("\t\t****** 추천 메뉴 ******");
		System.out.println();
		showAll(query);
	}
	
	
	public static void main(String[] args) {
		RandomMenu rm = new RandomMenu();
		rm.choiceMenu();
	}
	
}
