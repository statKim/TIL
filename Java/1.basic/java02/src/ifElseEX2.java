import java.util.Scanner;

public class KHSifElseEX2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// �� �Է� ����(num1, num2, num3)
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("����3 �Է� : ");
		int num3 = sc.nextInt();
		
		int max_val;
		
		if ((num1>num2) && (num1>num2))
			max_val = num1;
		else if ((num2>num1) && (num2>num3)) // (num2>num3)�� �ص� ��
			max_val = num2;
		else
			max_val = num3;
		
//		//�̷��� �ص� ��!!
//		if ((num1>num2) && (num1>num2))
//			max_val = num1;
//		else	// �� num1�� ���� ũ�ٴ� ���� �ƴ� ��
//			if (num2>num3)
//				max_val = num2;
//			else
//				max_val = num3;
		
		System.out.println("���� ū �� : " + max_val);
		
		sc.close();

	}

}
