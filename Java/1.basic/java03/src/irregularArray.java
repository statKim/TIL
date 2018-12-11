
public class KHSirregularArray {

	public static void main(String[] args) {
		
		int a[][] = new int[4][];
		a[0] = new int[1];	// 0행에 열 1개 생성
		a[1] = new int[2];	// 1행에 열 2개 생성
		a[2] = new int[2];	// 2행에 열 2개 생성
		a[3] = new int[4];	// 3행에 열 4개 생성
		
		char b[][] = {{'a'}, {'b','c'}, {'d','e','f'}};
		
		String student[][] = {{"홍길동","학생"},
							{"성춘향","3학년","영어영문학과"},
							{"이몽룡","4학년","물리학과","A"}};
		
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
