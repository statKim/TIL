// ���۰��� ���������� �޾Ƽ� �� ������ ���� ���ϴ� ���α׷�
import java.util.Scanner;

public class KHSforEx3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("start �Է� : ");
		int start = sc.nextInt();
		System.out.print("end �Է� : ");
		int end = sc.nextInt();
		
		int sum = 0;
		for (int i=start; i<=end; i++) {
			sum = sum + i;
		}
		
		System.out.println(start + " ~ " + end + "�� �� : " + sum);
		
		sc.close();
		
	}

}
