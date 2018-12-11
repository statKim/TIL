
public class KHS2Darray2 {

	public static void main(String[] args) {
		
		// 5x3 matrix
		int[][] a = {{5,9,3},
					{7,4,8},
					{9,5,7},
					{7,8,9},
					{6,9,4}};
		
		int sum;
		
		System.out.println("각 행의 합 출력");
		
		for (int i=0; i<a.length; i++) {
			sum = 0;	// 각 행의 합을 구하기 위해 다음 행으로 가면 초기화해줌
			for (int j=0; j<a[i].length; j++) {
				sum = sum + a[i][j];
				System.out.print(a[i][j] + "\t");
			}
			System.out.println((i+1) + "행의 합 : " + sum);
		}
		

	}

}
