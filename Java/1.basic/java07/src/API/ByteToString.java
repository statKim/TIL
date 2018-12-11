package API;

public class ByteToString {
	// String() : 생성자!!
	public static void main(String[] args) {

		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);	// 6th index부터 4개!!
		System.out.println(str2);				// 주의 : 인덱스는 0부터!!
	}

}

