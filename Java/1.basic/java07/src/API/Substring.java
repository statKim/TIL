package API;

public class Substring {
	// substring() : 문자열 인덱스로 가져오기
	public static void main(String[] args) {

		String ssn = "880815-1234567 ";
		
		String firstNum = ssn.substring(0,6); // 0~5th index까지 출력
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 7th index부터 끝까지 출력
		System.out.println(secondNum);

	}

}
