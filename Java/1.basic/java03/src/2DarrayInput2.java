import java.util.Scanner;

public class KHS2DarrayInput2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[2][5];
		int sum = 0, max = 0;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "] �Է� : ");
				a[i][j] = sc.nextInt();
				sum = sum + a[i][j];
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.print("�迭 a�� �� ������ �� ���\n");
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n�ִ밪 : " + max);
		System.out.println("������ �� �� : " + sum);
		
		sc.close();

	}

}
