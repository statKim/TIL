import java.util.Scanner;

public class KHSexercise07 {

	public static void main(String[] args) {
		
		int num, a;		
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
			num = sc.nextInt();
			
			if (num==1) {
				System.out.print("���ݾ�> ");
				a = sc.nextInt();
				balance = balance + a;
			}
			else if (num==2) {
				System.out.print("��ݾ�> ");
				a = sc.nextInt();
				balance = balance - a;
			}
			else if (num==3) {
				System.out.println("�ܰ�> " + balance);
			} else
				run = false;
				//break;

			
//			switch (num) {
//			case 1 : 
//				System.out.print("���ݾ�> ");
//				a = sc.nextInt();
//				balance = balance + a;
//				break;
//			case 2 :
//				System.out.print("��ݾ�> ");
//				a = sc.nextInt();
//				balance = balance - a;
//				break;
//			case 3 :
//				System.out.println("�ܰ�> " + balance);
//				break;
//			case 4 :
//				run = false;
//				break;
//			}
			
			System.out.println("");		
		}
		System.out.print("���α׷� ����");
		
		sc.close();
	}

}
