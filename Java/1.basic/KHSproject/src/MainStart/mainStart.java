package MainStart;

import java.util.Scanner;

import Menu.ChoiceMenu;

public class mainStart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ChoiceMenu choice = new ChoiceMenu();
		
		int command;

		choice.readData();
		
		do {
			System.out.println("\n===================================");
			System.out.println("1.메뉴추천 2.리스트 추가 3.전체 리스트 확인 4.종료");
			System.out.print("\t번호를 선택하세요 : ");
			command = sc.nextInt();
			System.out.println("===================================");
			
			switch (command) {
				case 1 :
					choice.secondMenu();
					break;
				case 2 :
					choice.addList();
					break;
				case 3 :
					choice.showAll();
					break;
			}
		} while (command != 4);
		
		System.out.println("\t종료합니다.");
		
		sc.close();
		
	}

}
