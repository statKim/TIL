package start;

import java.util.Scanner;

import info.PersonalInfo;
import test.capitalTest;

public class testStart {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int command;
		
		System.out.println("--------------------");
		System.out.println("��� 1�� �ڰ��� ����");
		System.out.println("--------------------");
		System.out.println("���� �޴����� ����");
		System.out.println("--------------------");
		
		do {
			System.out.print("�޴� ��ȣ �Է� : ");
			command = sc.nextInt();
			switch (command) {
				case 1:
					PersonalInfo pi = new PersonalInfo("������","��������а�",00000000,4);
					pi.showInfo();
					break;
				case 2:
					capitalTest ct = new capitalTest();
					ct.startTest();
					break;
			}
			
		} while (command != 3);
		System.out.println("�����մϴ�!");		
		
		sc.close();
	}
}
