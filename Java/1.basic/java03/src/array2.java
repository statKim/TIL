
public class KHSarray2 {

	public static void main(String[] args) {

		int[] b = new int[5];	// ����� ���ÿ� �޸� �Ҵ� => ��� ���Ұ��� 0(�ʱⰪ)
		//int b[] = new int[5]
		String[] flowers = {"�عٶ��", "���", "���޷�"};	// �ʱ�ȭ ����Ʈ(�ٷ� �� ����)
		
		// for������ b ���ҿ� �� ����
		for (int i=0; i<b.length; i++) {
			b[i] = i;
		}
		
		// for������ b ���
		for (int i=0; i<b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
		// for������ flowers ���
		for (int i=0; i<flowers.length; i++) {
			System.out.println("flowers[" + i + "] = " + flowers[i]);
		}
		
		System.out.println("b�� ũ�� : " + b.length);
		System.out.println("flowers�� ũ�� : " + flowers.length);
	}

}
