// Math.random() : 0���� 1  ������ ���� ����
public class KHSrandomNum1 {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {
			//double num = Math.random();			// 0�� 1������ ����
			//double num = Math.random()*10;
			//int num = (int)(Math.random()*10);		// 0~9������ ����
			int num = (int)(Math.random()*10) + 1;		// 1~10������ ����
			System.out.println(num);
		}

	}

}
