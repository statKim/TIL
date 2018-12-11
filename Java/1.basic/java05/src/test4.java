import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("달팽이의 차수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		for (int i=1; i<=num; i++) {
//			System.out.print(i + "\t");
//		}
//		System.out.println();
//		
//		//for (int )
		
		int deg, n;
		int row, col; // 행,열
		int k = 0;
		
		System.out.print("달팽이의 차수를 입력하세요 : ");
		deg = sc.nextInt();
		int[][] snail = new int[deg][deg];
		int i = 1;
		
		for (n=deg; n>0; n=n-2) {
			for (col=0; col<n; col++ ) {
				snail[k][k+col]=i;
				i++;
			}
			
			for (row=1; row<n; row++) {
				snail[k+row][deg-k-1]=i;
				i++;
			}
			
			for (col=1; col<n; col++) {
				snail[k+row-1][deg-k-col-1]=i;
				i++;
			}
			
			for (col=1; col<n-1; col++) {
				snail[deg-k-col-1][k]=i;
				i++;
			}
			k++;
		}
		
		for (row=0; row<deg; row++) {
			for (col=0; col<deg; col++) {
				System.out.print(snail[row][col] + "\t");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
