
public class KHS2Darray1 {

	public static void main(String[] args) {
		
		// 3x4 matrix ���� �� �ʱ�ȭ
		int[][] a = {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}};	// �Ǵ� {{...},{...},{...}} ���·� �ص� ��
		
		System.out.println("2���� �迭 a�� ������ �� ���");
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "] : " + a[i][j]);
			}
			System.out.println();
		}
		
		// 2���� ���·� ���� �� ���
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		// 2���� �迭�� length
		System.out.println("a�� length : " + a.length);
		System.out.println("a[0]�� length : " + a[0].length);
		System.out.println("a[1]�� length : " + a[1].length);
		System.out.println("a[2]�� length : " + a[2].length);
		
	}

}
