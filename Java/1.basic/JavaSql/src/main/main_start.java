package main;

import java.util.Scanner;

import Menu.InsertMenu;
import Menu.RandomMenu;

public class main_start {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		RandomMenu rm = new RandomMenu();
		
		int command;
		
		InsertMenu im = new InsertMenu();
		
		
		do {
			System.out.println("\n===================================");
			System.out.println("1.�޴���õ 2.����Ʈ �߰� 3.��ü ����Ʈ Ȯ�� 4.����");
			System.out.print("\t��ȣ�� �����ϼ��� : ");
			command = sc.nextInt();
			System.out.println("===================================");
			
			switch (command) {
				case 1 :
					rm.choiceMenu();
					break;
				case 2 :
					im.addMenu();
					break;
				case 3 :
					String query = "SELECT * FROM menuList";
					rm.showAll(query);
					break;
			}
		} while (command != 4);
		
		System.out.println("\t�����մϴ�.");
		
		sc.close();

	}

}
