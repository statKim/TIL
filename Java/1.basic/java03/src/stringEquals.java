
public class KHSstringEquals {

	public static void main(String[] args) {
		
		// ���� ��ü�� �����ϴ� ��� & ���ڿ��� ����
		String strVar1 = "������";
		String strVar2 = "������";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if (strVar1.equals(strVar2)) {	// ���ڿ� ��(���� ��)
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		// �ٸ� ��ü�� �����ϴ� ��� & ���ڿ��� ����
		String strVar3 = new String("������");
		String strVar4 = new String("������");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
	}

}
