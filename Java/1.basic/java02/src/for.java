
public class KHSfor {

	public static void main(String[] args) {
		
		// i=1~10���� 1�� �����ϸ鼭 �ݺ�, for�� �ȿ��� ������ i�� for�� �ȿ����� ��� ����
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		int sum = 0;
		int i;
		
		for (i=1; i<=100; i++) {
			sum = sum + i;
			//sum += i;
		}
		// i=101�� �Ǹ鼭 for�� �������� => (i-1)�� ����
		System.out.println("1~" + (i-1) + " �� : " + sum);
		
		
	}

}
