// ���������
import java.util.Scanner;

public class KHSarithmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("����1 �Է� : ");
		num1 = sc.nextInt();
		
		System.out.print("����2 �Է� : ");
		num2 = sc.nextInt();
		
		System.out.println("���� = " + (num1 + num2));
		System.out.println("���� = " + (num1 - num2));
		System.out.println("���� = " + (num1 * num2));
		System.out.println("������ = " + (num1 / num2));
		System.out.println("������ = " + (num1 % num2));
		
		sc.close();

	}

}
