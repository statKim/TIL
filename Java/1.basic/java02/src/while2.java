import java.util.Scanner;

public class KHSwhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
			
		while (num != 7) {		// 7�� �ƴϸ� ��� �ٽ� �Է�
			System.out.print("�ٽ� �Է� : ");
			num = sc.nextInt();
		}

		System.out.println("7 �Է�. ����");
		sc.close();
		
	}

}
