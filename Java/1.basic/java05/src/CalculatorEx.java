
public class CalculatorEx {

	public static void main(String[] args) {

		// 객체 생성 안하고 클래스명.메소드 사용
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

	}

}
