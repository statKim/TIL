// ����Ŀ����� �ڵ���ȯ - ū������ �ڵ� ��ȯ �� ����!!!
public class KHSoperationsPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue3 = byteValue1 + byteValue2;	//������ ���� - byte ũ�� �Ѿ�� ������ int�� �ڵ� ��ȯ��
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		//char charValue3 = charValue1 + charValue2;	//������ ���� - char ���� ����� int�� �ڵ���ȯ
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� = " + intValue2);
		System.out.println("��¹��� = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;					// ����/���� => ����
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;						//������ ����
		double doubleValue = intValue5 / 4.0;			// ����/�Ǽ� => �Ǽ�
		System.out.println(doubleValue);
		
		char str1 = 'a';
		String str2 = "bcd";
		String str3 = str1 + str2;						// char�� String���� �ٲ㼭 ����
		System.out.println(str3);
		
		//char var = (char) str2;		// ������ ����(string -> char �� �Ұ���!!)
	}

}
