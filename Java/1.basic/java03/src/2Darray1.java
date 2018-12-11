
public class KHS2Darray1 {

	public static void main(String[] args) {
		
		// 3x4 matrix 선언 및 초기화
		int[][] a = {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}};	// 또는 {{...},{...},{...}} 형태로 해도 됨
		
		System.out.println("2차원 배열 a의 원소의 값 출력");
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "] : " + a[i][j]);
			}
			System.out.println();
		}
		
		// 2차원 행태로 원소 값 출력
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		// 2차원 배열의 length
		System.out.println("a의 length : " + a.length);
		System.out.println("a[0]의 length : " + a[0].length);
		System.out.println("a[1]의 length : " + a[1].length);
		System.out.println("a[2]의 length : " + a[2].length);
		
	}

}
