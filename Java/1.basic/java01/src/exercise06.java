
public class KHSexercise06 {

	public static void main(String[] args) {

		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop+lengthBottom) * height / 2.0;
		//float일 땐  f 붙여줄것
		float area_float = (lengthTop+lengthBottom) * height / 2.0f;
		// 뒤에 2(int)로 나누면 int 결과를 double로 표현하여 소수점 이하는 .0이 된다
		double area_2 = (lengthTop+lengthBottom) * height / 2;
		
		System.out.println(area);
		System.out.println(area_float);
		System.out.println(area_2);

	}

}
