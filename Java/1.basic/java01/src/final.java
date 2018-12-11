
public class KHSfinal {

	public static void main(String[] args) {
		final double PI = 3.14;		// PI를 상수로 지정(나중에 갑 변경하지 않는 변수)
		double radius = 10;
		double circleArea = 0;
		
		circleArea = radius * radius * PI;
		
		System.out.println("원의 면적 =" + circleArea);
		
		char a = 'A';	// 문자 하나 저장시에는 작은 따옴표 사용!!
		System.out.println(a);
		
		String b = "4d";	// 문자열 저장시에는 큰 따옴표 사용!!, char가 아닌 String으로 변수 선언
		System.out.println(b);
	}

}
