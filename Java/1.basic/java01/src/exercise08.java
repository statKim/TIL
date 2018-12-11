
public class KHSexercise08 {

	public static void main(String[] args) {

		double x = 5.0;
		double y = 0.0;		// NaN
		//double y = 0.1;	//결과 나옴
		
		double z = x % y;
		
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}

	}

}
