package game_project.game;

import java.util.Scanner;

public class GaBaBo {

	Scanner sc = new Scanner(System.in);
	String answer = "";
	
	public void play() {
		System.out.println("가위 바위 보 게임 : 1.가위, 2.바위, 3.보");
		
		do {
			System.out.println("================================");
			System.out.print("\n번호 입력 : ");
			int yourNum = sc.nextInt();
			
			if (yourNum<1 || yourNum>3) {
				System.out.println("\n잘못 입력하였습니다");
			}
			else {
				//컴퓨터 번호 생성(1~3)
				int comNum = (int)(Math.random()*3) + 1;
				
				if (comNum==1 && yourNum==3 ||
					comNum==2 && yourNum==1 ||
					comNum==3 && yourNum==2) {
					System.out.println("컴퓨터가 이겼습니다^^");
				}
				else if (comNum == yourNum) {
					System.out.println("비겼습니다");
				} else {
					System.out.println("당신이 졌습니다");
				}
				
				//comNum 출력
				if (comNum==1) {
					System.out.println("컴퓨터는 가위입니다.");
				} else if (comNum==2) {
					System.out.println("컴퓨터는 바위입니다.");
				} else {
					System.out.println("컴퓨터는 보입니다.");
				}
				
				System.out.print("계속 하시겠습니까? (y) : ");
				answer = sc.next();		
			}
		} while (answer.equals("y"));
			
		System.out.println("게임을 종료합니다.");		
	}
	
}
