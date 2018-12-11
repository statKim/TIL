package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// ��� ����
public class ChoiceMenu extends MenuList {
	
	Scanner sc = new Scanner(System.in);
	
	// ��ü ����Ʈ ����ϴ� �޼ҵ�
	public void showAll() {
		showListAll(menu_list);
	}
	
	// �����ϰ� ���� 2��° �޴�
	public void secondMenu() {
		System.out.println("\n================================");
		System.out.println("1.��ü���� 2.��ġ ���� 3.���ݴ� ���� 4.�ڷ�");
		System.out.print("\t��ȣ�� �����ϼ��� : ");
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
				System.out.println("\n\t�߸� �����̽��ϴ�.");
				secondMenu();
		}
	}
	
	// ��ü ���� �޼ҵ�
	public void thiredMenu_1() {
		showRandom(menu_list);
	}
	
	// ���õ� ��ġ ���� �޼ҵ�
	public void thiredMenu_2() {
		System.out.println("\n================================");		
		System.out.print("\t��ġ�� �����ϼ��� : ");
		String search = sc.next();
		System.out.println("================================");	
		
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		for (Map<String,String> menu : menu_list) {
			if (menu.get("��ġ").equals(search)) {
				list.add(menu);				
			}
		}
		
		if (list.size()!=0) {
			showRandom(list);
		} else {
			System.out.print("���ǿ� �´� �޴��� �����ϴ�.");
		}	
	}
	
	// ���õ� ���� ���� �޼ҵ�
	public void thiredMenu_3() {
		System.out.println("\n================================");		
		System.out.print("\t������ �����ϼ��� : ");
		int money = sc.nextInt();
		System.out.print("\t1.�̻�  2.���� : ");
		int search = sc.nextInt();
		System.out.println("================================");	
		
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		
		switch (search) {
			case 1 :
			case 2 :	
				for (Map<String,String> menu : menu_list) {
					int price = Integer.parseInt(menu.get("����"));
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
				System.out.println("\n�߸� �����̽��ϴ�.");
				thiredMenu_3();
		}

		if (list.size()!=0) {
			showRandom(list);
		} else {
			System.out.print("���ǿ� �´� �޴��� �����ϴ�.");
		}
	}
	
}
