// 연산식에서의 자동변환 - 큰것으로 자동 변환 후 연산!!!
public class KHSoperationsPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue3 = byteValue1 + byteValue2;	//컴파일 에러 - byte 크기 넘어가기 때문에 int로 자동 변환함
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		//char charValue3 = charValue1 + charValue2;	//컴파일 에러 - char 범위 벗어나서 int로 자동변환
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;					// 정수/정수 => 정수
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;						//컴파일 에러
		double doubleValue = intValue5 / 4.0;			// 정수/실수 => 실수
		System.out.println(doubleValue);
		
		char str1 = 'a';
		String str2 = "bcd";
		String str3 = str1 + str2;						// char를 String으로 바꿔서 연산
		System.out.println(str3);
		
		//char var = (char) str2;		// 컴파일 에러(string -> char 는 불가능!!)
	}

}
