package game_project.game;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	Scanner sc = new Scanner(System.in);
	int n;
	
	public void play() {
		Random r = new Random();
		int x = r.nextInt(10) + 1; //1~10
		
		System.out.println("-------------------------------");
		System.out.println("� �����ϱ��? �˾Ƹ���������^^ (1~10)");
		System.out.println("-------------------------------");
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();
		
		while (n != x) {
			System.out.println("-----------------------------");
			System.out.print("�ƴմϴ�. �ٽ� ����������^^ �ٽ� �Է� : ");
			n = sc.nextInt();
		}
		
		System.out.println("---------------------------------");
		System.out.println("���� �������ϴ�~ ���� ���ڴ� " + n + "�Դϴ�");
		System.out.println("*********************************");
	}
	
}
