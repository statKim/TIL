import java.util.Scanner;

public class KHSdoWhile1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, sum=0;
		
		do {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			sum = sum + num;
		} while (num!=0);	// 0�ƴϸ� ��� �ݺ�
		
		System.out.println("0 �Է�. �ݺ��� ����");
		System.out.println("�Է��� ���� ���� : " + sum);
		
		sc.close();
		
	}

}
