package start;

import java.util.Scanner;

import info.PersonalInfo;
import test.capitalTest;

public class testStart {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int command;
		
		System.out.println("--------------------");
		System.out.println("상식 1급 자격증 시험");
		System.out.println("--------------------");
		System.out.println("다음 메뉴에서 선택");
		System.out.println("--------------------");
		
		do {
			System.out.print("메뉴 번호 입력 : ");
			command = sc.nextInt();
			switch (command) {
				case 1:
					PersonalInfo pi = new PersonalInfo("김현성","응용통계학과",00000000,4);
					pi.showInfo();
					break;
				case 2:
					capitalTest ct = new capitalTest();
					ct.startTest();
					break;
			}
			
		} while (command != 3);
		System.out.println("종료합니다!");		
		
		sc.close();
	}
}
