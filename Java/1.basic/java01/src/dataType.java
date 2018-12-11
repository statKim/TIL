
public class KHSdataType {

	public static void main(String[] args) {
		
		// 모두 같은 문자 출력하는 예
		char a = 'A';		// 문자 A
		char b = '\u0041';  // 문자 A의 유니코드 값
		char c = 65;		// 문자 A의 ASCII코드 값 (char로 선언했기 때문에 정수로 안들어감)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("=================================");
		
		// 정수 타입 변수 선언 및 초기화
		byte byteValue = 10;				// 1 byte 정수
		short shortValue = 1000;			// 2 byte 정수
		int intValue = 2100100100;			// 4 byte 정수
		long longValue = 100010001000100L;	// 8 byte 정수
		
		System.out.println("byteValue = " + byteValue);
		System.out.println("shortValue = " + shortValue);
		System.out.println("intValue = " + intValue);
		System.out.println("longValue = " + longValue);
				
		System.out.println("=================================");
		
		// 실수 타입 변수 선언 및 초기화
		double doubleValue = 0.1234567890123456789;	// 8 byte 실수
		float floatValue = 0.1234567890123456789f;	// 4 byte 실수
		
		System.out.println("doubleValue = " + doubleValue);
		System.out.println("floatValue = " + floatValue);
		
		System.out.println("=================================");
		
		// e 사용하기 (10의 제곱수)
		int var1 = 3000000;	
		double var2 = 3e6;	// 0이 6개
		float var3 = 3e6F;	// float
		double var4 = 2e-3;	// 소수점이하 3자리
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		
		System.out.println("=================================");
		
		// bool type 변수
		boolean booleanValue = true;
		
		System.out.println("booleanValue = " + booleanValue);
		
		System.out.println("=================================");
		
		// Sting type 변수
		String name = "홍길동";
		
		System.out.println("성명 = " + name);
	}

}
