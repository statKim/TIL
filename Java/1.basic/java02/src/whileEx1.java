
public class KHSwhileEx1 {

	public static void main(String[] args) {

		int i=0, sum=0;
		
		// 0���� 100���� 2�� ����!1 => ¦���� ���ϰ� ��
		while (i<=100) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("1~100 ¦���� �� : " + sum);
	}

}
