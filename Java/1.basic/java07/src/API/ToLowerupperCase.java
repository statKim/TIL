package API;

public class ToLowerupperCase {
	// toLowerCase() : �ҹ��ڷ� ����(�ݴ�� Upper)
	// equalsIgnoreCase() : ��ҹ��� �����ϰ� ��
	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase(); //java programming
		String lowerStr2 = str2.toLowerCase(); //java programming
		System.out.println(lowerStr1.equals(lowerStr2));
		// equalsIgnoreCase() : ��ҹ��� �����ϰ� ��!!
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
