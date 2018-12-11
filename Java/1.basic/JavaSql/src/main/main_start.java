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
			System.out.println("1.메뉴추천 2.리스트 추가 3.전체 리스트 확인 4.종료");
			System.out.print("\t번호를 선택하세요 : ");
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
		
		System.out.println("\t종료합니다.");
		
		sc.close();

	}

}
