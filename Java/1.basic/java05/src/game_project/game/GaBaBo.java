package game_project.game;

import java.util.Scanner;

public class GaBaBo {

	Scanner sc = new Scanner(System.in);
	String answer = "";
	
	public void play() {
		System.out.println("���� ���� �� ���� : 1.����, 2.����, 3.��");
		
		do {
			System.out.println("================================");
			System.out.print("\n��ȣ �Է� : ");
			int yourNum = sc.nextInt();
			
			if (yourNum<1 || yourNum>3) {
				System.out.println("\n�߸� �Է��Ͽ����ϴ�");
			}
			else {
				//��ǻ�� ��ȣ ����(1~3)
				int comNum = (int)(Math.random()*3) + 1;
				
				if (comNum==1 && yourNum==3 ||
					comNum==2 && yourNum==1 ||
					comNum==3 && yourNum==2) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�^^");
				}
				else if (comNum == yourNum) {
					System.out.println("�����ϴ�");
				} else {
					System.out.println("����� �����ϴ�");
				}
				
				//comNum ���
				if (comNum==1) {
					System.out.println("��ǻ�ʹ� �����Դϴ�.");
				} else if (comNum==2) {
					System.out.println("��ǻ�ʹ� �����Դϴ�.");
				} else {
					System.out.println("��ǻ�ʹ� ���Դϴ�.");
				}
				
				System.out.print("��� �Ͻðڽ��ϱ�? (y) : ");
				answer = sc.next();		
			}
		} while (answer.equals("y"));
			
		System.out.println("������ �����մϴ�.");		
	}
	
}
