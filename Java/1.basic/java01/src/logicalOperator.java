// 일반적으로 논리연산자는 2개짜리 사용 => &&, ||
public class KHSlogicalOperator {

	public static void main(String[] args) {
		
		int charCode = 'A';		// 문자의 코드를 저장
		
		if ((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		
		if ((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자 이군요");
		}
		
		if (!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자 이군요");
		}
		
		
		int value = 6;
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
	}

}
