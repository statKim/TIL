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
			System.out.println("1.�޴���õ 2.����Ʈ �߰� 3.��ü ����Ʈ Ȯ�� 4.����");
			System.out.print("\t��ȣ�� �����ϼ��� : ");
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
		
		System.out.println("\t�����մϴ�.");
		
		sc.close();
		
	}

}
