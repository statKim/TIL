// byte�� int�� ���� ����!!!
// byte������ �ִ밪�� 127�� �Ѿ�� �ּҰ��� -128���� �ٽ� ������(���� : -128~127)
public class KHSgarbageValueExample {

	public static void main(String[] args) {
		
		byte var1 =  125;
		int var2 = 125;
		
		for (int i=0; i<5; i++) {	// �ʱⰪ i=0, i�� 1�� ���ϸ鼭 5���� ���� ������ �ݺ�
			var1++;	// var1�� 1 ����
			var2++;	// var2�� 1 ����
			System.out.println("var1: " + var1 + "\t" + "var2 : " + var2);;
			
		}
		
	}

}
