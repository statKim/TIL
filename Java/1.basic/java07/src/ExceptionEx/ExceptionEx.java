package ExceptionEx;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 �Է� : ");
		int n1 = sc.nextInt();
		
		System.out.print("����2 �Է� : ");
		int n2 = sc.nextInt();
		
		// ������ ������ ����Ǵ� ���常 try���� ����
		try {
			int result = n1/n2;
			System.out.println("������ ��� : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
		}
		
		sc.close();
	}

}
