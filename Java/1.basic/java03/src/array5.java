
public class KHSarray5 {

	public static void main(String[] args) {

		int[] scores;
		scores = new int[] {83, 90, 87};
		
		// for������ �� ���
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 = sum1 + scores[i];
		}
		System.out.println("���� : " + sum1);
		
		// add() �޼ҵ�� ���(����� ���� �Լ�)
		//int sum2 = add(new int[] {83,90,87});
		int sum2 = add(scores);
		System.out.println("���� : " + sum2);
		System.out.println();

	}
	
	// ���� ����ؼ� return�ϴ� �޼ҵ�(�Լ�) => ����Ǽ� ����� ������ ���� �ƴ�!!(������ add�Լ��� ����)
	public static int add(int[] scores) { // scores�� ���� �迭(����) �̸�!!
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum = sum + scores[i];
		}
		return sum;
	}

}
