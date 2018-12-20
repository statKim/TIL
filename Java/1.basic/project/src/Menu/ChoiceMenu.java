package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 상속 받음
public class ChoiceMenu extends MenuList {
	
	Scanner sc = new Scanner(System.in);
	
	// 전체 리스트 출력하는 메소드
	public void showAll() {
		showListAll(menu_list);
	}
	
	// 랜덤하게 고르는 2번째 메뉴
	public void secondMenu() {
		System.out.println("\n================================");
		System.out.println("1.전체랜덤 2.위치 지정 3.가격대 지정 4.뒤로");
		System.out.print("\t번호를 선택하세요 : ");
		int command = sc.nextInt();
		System.out.println("================================");
		
		switch (command) {
			case 1 :
				thiredMenu_1();
				break;
			case 2 :
				thiredMenu_2();
				break;
			case 3 :
				thiredMenu_3();
				break;
			case 4 :
				break;
			default :
				System.out.println("\n\t잘못 누르셨습니다.");
				secondMenu();
		}
	}
	
	// 전체 랜덤 메소드
	public void thiredMenu_1() {
		showRandom(menu_list);
	}
	
	// 선택된 위치 랜덤 메소드
	public void thiredMenu_2() {
		System.out.println("\n================================");		
		System.out.print("\t위치를 지정하세요 : ");
		String search = sc.next();
		System.out.println("================================");	
		
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		for (Map<String,String> menu : menu_list) {
			if (menu.get("위치").equals(search)) {
				list.add(menu);				
			}
		}
		
		if (list.size()!=0) {
			showRandom(list);
		} else {
			System.out.print("조건에 맞는 메뉴가 없습니다.");
		}	
	}
	
	// 선택된 가격 랜덤 메소드
	public void thiredMenu_3() {
		System.out.println("\n================================");		
		System.out.print("\t가격을 지정하세요 : ");
		int money = sc.nextInt();
		System.out.print("\t1.이상  2.이하 : ");
		int search = sc.nextInt();
		System.out.println("================================");	
		
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		
		switch (search) {
			case 1 :
			case 2 :	
				for (Map<String,String> menu : menu_list) {
					int price = Integer.parseInt(menu.get("가격"));
					if (search==1) {
						if (price>=money) {
							list.add(menu);				
						}
					} else if (search==2) {
						if (price<=money) {
							list.add(menu);				
						}
					}
				}
				break;
			default :
				System.out.println("\n잘못 누르셨습니다.");
				thiredMenu_3();
		}

		if (list.size()!=0) {
			showRandom(list);
		} else {
			System.out.print("조건에 맞는 메뉴가 없습니다.");
		}
	}
	
}
