
public class KHSexercise06 {

	public static void main(String[] args) {

		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop+lengthBottom) * height / 2.0;
		//float�� ��  f �ٿ��ٰ�
		float area_float = (lengthTop+lengthBottom) * height / 2.0f;
		// �ڿ� 2(int)�� ������ int ����� double�� ǥ���Ͽ� �Ҽ��� ���ϴ� .0�� �ȴ�
		double area_2 = (lengthTop+lengthBottom) * height / 2;
		
		System.out.println(area);
		System.out.println(area_float);
		System.out.println(area_2);

	}

}
