// byte�� ������ȯ �� ��ȯ�ϸ鼭 ������ �ս� �߻��ϴ��� Ȯ���ϴ� �ڵ�
public class KHScheckValueBeforeCasting {

	public static void main(String[] args) {
		
		int i = 128;	// ��ȯ �Ұ�	byte ���� : (-128~127)
		//int i = 127;	// ��ȯ��
		//int i = -128;	// ��ȯ��
		
		if ( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {	//i�� byte�� �ּҺ��� �۰ų� �ִ뺸�� ũ��
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");	// ��ȯ�Ұ����ϴٴ� ���� ���
			System.out.println("���� �ٽ� Ȯ���� �ּ���");
		} else {
			byte b = (byte) i;								// byte�� ���� �ȿ� ��� 
			System.out.println(b);							// int���� byte������ ��ȯ
			
		}

	}

}
