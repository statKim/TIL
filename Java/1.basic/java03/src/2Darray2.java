
public class KHS2Darray2 {

	public static void main(String[] args) {
		
		// 5x3 matrix
		int[][] a = {{5,9,3},
					{7,4,8},
					{9,5,7},
					{7,8,9},
					{6,9,4}};
		
		int sum;
		
		System.out.println("�� ���� �� ���");
		
		for (int i=0; i<a.length; i++) {
			sum = 0;	// �� ���� ���� ���ϱ� ���� ���� ������ ���� �ʱ�ȭ����
			for (int j=0; j<a[i].length; j++) {
				sum = sum + a[i][j];
				System.out.print(a[i][j] + "\t");
			}
			System.out.println((i+1) + "���� �� : " + sum);
		}
		

	}

}
