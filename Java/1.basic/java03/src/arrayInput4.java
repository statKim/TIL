import java.util.Scanner;

public class KHSarrayInput4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int max=0, min=Integer.MAX_VALUE;	// ���� �ּҰ� �� ������ int ������ �ִ밪 �����ؼ� �ϸ� �ɵ�??
		
		System.out.println("���� �Է�");

		for (int i=0; i<num.length; i++) {
			System.out.print("num[" + i + "] : ");
			num[i] = sc.nextInt();
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		
		System.out.println();
		System.out.print("�Էµ� �� : ");
		//System.out.println("\n�Էµ� �� : ");
		
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");		
		}
		
		System.out.println();
		System.out.println("�ִ밪 : " + max);
		//System.out.println("\n�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		sc.close();

	}

}
