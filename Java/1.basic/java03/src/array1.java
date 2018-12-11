
public class KHSarray1 {

	public static void main(String[] args) {
		
		int[] a;		// 배열 a 생성, 아직 메모리 할당 X(즉 몇개짜리인지 안정함)
		a = new int[3];	// 메모리 할당(3개짜리 배열 생성)
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("--------------");
		
		for (int i=0; i<a.length; i++)	// a.length : 배열의 크기
			System.out.println(a[i]);
		
		System.out.println(a.length);	// a의 크기!!!
	}
		
}
