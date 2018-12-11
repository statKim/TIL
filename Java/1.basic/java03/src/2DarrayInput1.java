import java.util.Scanner;

public class KHS2DarrayInput1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[4][3];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "} 입력 : ");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("배열 a의 각 원소의 값 출력");
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
