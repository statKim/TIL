import java.util.Scanner;

public class KHSforEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		//int pos=0, neg=0, zero=0; //�̷��� �� �ٿ� �ص� ��
		int pos = 0;
		int neg = 0;
		int zero = 0;
		
		for (int i=1; i<=10; i++) {
			System.out.print("����" + i + " �Է� : ");
			num = sc.nextInt();
			
			if (num > 0)
				pos = pos + 1;
			else if (num < 0)
				neg = neg + 1;
			else
				zero = zero + 1;
		}
		
		System.out.println("\n��� ���� : " + pos);
		System.out.println("���� ���� : " + neg);
		System.out.println("0�� ���� : " + zero);
		 
		sc.close();

	}

}
