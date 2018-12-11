
public class KHSfor {

	public static void main(String[] args) {
		
		// i=1~10까지 1씩 증가하면서 반복, for문 안에서 선언한 i는 for문 안에서만 사용 가능
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		int sum = 0;
		int i;
		
		for (i=1; i<=100; i++) {
			sum = sum + i;
			//sum += i;
		}
		// i=101이 되면서 for문 빠져나옴 => (i-1)로 해줌
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		
	}

}
