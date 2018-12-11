
public class KHSdataType {

	public static void main(String[] args) {
		
		// ��� ���� ���� ����ϴ� ��
		char a = 'A';		// ���� A
		char b = '\u0041';  // ���� A�� �����ڵ� ��
		char c = 65;		// ���� A�� ASCII�ڵ� �� (char�� �����߱� ������ ������ �ȵ�)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("=================================");
		
		// ���� Ÿ�� ���� ���� �� �ʱ�ȭ
		byte byteValue = 10;				// 1 byte ����
		short shortValue = 1000;			// 2 byte ����
		int intValue = 2100100100;			// 4 byte ����
		long longValue = 100010001000100L;	// 8 byte ����
		
		System.out.println("byteValue = " + byteValue);
		System.out.println("shortValue = " + shortValue);
		System.out.println("intValue = " + intValue);
		System.out.println("longValue = " + longValue);
				
		System.out.println("=================================");
		
		// �Ǽ� Ÿ�� ���� ���� �� �ʱ�ȭ
		double doubleValue = 0.1234567890123456789;	// 8 byte �Ǽ�
		float floatValue = 0.1234567890123456789f;	// 4 byte �Ǽ�
		
		System.out.println("doubleValue = " + doubleValue);
		System.out.println("floatValue = " + floatValue);
		
		System.out.println("=================================");
		
		// e ����ϱ� (10�� ������)
		int var1 = 3000000;	
		double var2 = 3e6;	// 0�� 6��
		float var3 = 3e6F;	// float
		double var4 = 2e-3;	// �Ҽ������� 3�ڸ�
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		
		System.out.println("=================================");
		
		// bool type ����
		boolean booleanValue = true;
		
		System.out.println("booleanValue = " + booleanValue);
		
		System.out.println("=================================");
		
		// Sting type ����
		String name = "ȫ�浿";
		
		System.out.println("���� = " + name);
	}

}
