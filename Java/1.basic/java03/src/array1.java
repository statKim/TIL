
public class KHSarray1 {

	public static void main(String[] args) {
		
		int[] a;		// �迭 a ����, ���� �޸� �Ҵ� X(�� �¥������ ������)
		a = new int[3];	// �޸� �Ҵ�(3��¥�� �迭 ����)
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("--------------");
		
		for (int i=0; i<a.length; i++)	// a.length : �迭�� ũ��
			System.out.println(a[i]);
		
		System.out.println(a.length);	// a�� ũ��!!!
	}
		
}
