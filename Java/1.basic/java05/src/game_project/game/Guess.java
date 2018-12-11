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
		System.out.println("어떤 숫자일까요? 알아맞혀보세요^^ (1~10)");
		System.out.println("-------------------------------");
		
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		
		while (n != x) {
			System.out.println("-----------------------------");
			System.out.print("아닙니다. 다시 맞혀보세요^^ 다시 입력 : ");
			n = sc.nextInt();
		}
		
		System.out.println("---------------------------------");
		System.out.println("드디어 맞혔습니다~ 나의 숫자는 " + n + "입니다");
		System.out.println("*********************************");
	}
	
}
