// input�� �޴� ���!!!
import java.util.Scanner;

public class KHSinput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("ù��° ���� �Է� : ");		//  print()�� �� �ȹٲٰ� �ٷ� ������ �� ���� �� ����
		num1 = sc.nextInt();	// �Է��� ���� ������ ��ȯ�Ͽ� num1�� ����
		
		System.out.print("�ι�° ���� �Է� : ");
		num2 = sc.nextInt();
		
		System.out.println("=====================");
		System.out.println("�� ���� �� : " + (num1 + num2));
		System.out.println("�� ���� �� : " + (num1 * num2));
		
		sc.close(); // ���ҽ� ���� ���� ���� �ݱ�

	}

}
