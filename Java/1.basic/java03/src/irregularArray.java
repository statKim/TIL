
public class KHSirregularArray {

	public static void main(String[] args) {
		
		int a[][] = new int[4][];
		a[0] = new int[1];	// 0�࿡ �� 1�� ����
		a[1] = new int[2];	// 1�࿡ �� 2�� ����
		a[2] = new int[2];	// 2�࿡ �� 2�� ����
		a[3] = new int[4];	// 3�࿡ �� 4�� ����
		
		char b[][] = {{'a'}, {'b','c'}, {'d','e','f'}};
		
		String student[][] = {{"ȫ�浿","�л�"},
							{"������","3�г�","������а�"},
							{"�̸���","4�г�","�����а�","A"}};
		
		int count = 1;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j] = count++;
			}
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i=0; i<student.length; i++) {
			for (int j=0; j<student[i].length; j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
	}

}
