import java.util.Scanner;

public class KHSexercise07 {

	public static void main(String[] args) {
		
		int num, a;		
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			
			if (num==1) {
				System.out.print("예금액> ");
				a = sc.nextInt();
				balance = balance + a;
			}
			else if (num==2) {
				System.out.print("출금액> ");
				a = sc.nextInt();
				balance = balance - a;
			}
			else if (num==3) {
				System.out.println("잔고> " + balance);
			} else
				run = false;
				//break;

			
//			switch (num) {
//			case 1 : 
//				System.out.print("예금액> ");
//				a = sc.nextInt();
//				balance = balance + a;
//				break;
//			case 2 :
//				System.out.print("출금액> ");
//				a = sc.nextInt();
//				balance = balance - a;
//				break;
//			case 3 :
//				System.out.println("잔고> " + balance);
//				break;
//			case 4 :
//				run = false;
//				break;
//			}
			
			System.out.println("");		
		}
		System.out.print("프로그램 종료");
		
		sc.close();
	}

}
