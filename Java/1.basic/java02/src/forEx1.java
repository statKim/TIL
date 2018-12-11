
public class KHSforEx1 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
//		for (i=1; i<=10; i++) {
//			if (i%2!=0) {
//				System.out.println(i);
//				sum = sum + i;
//			}
//		}
//		System.out.println("1~10 홀수의 합 : " + sum);
		
		// 조건식에 i=i+2로 하면 2씩 증가함
		for (i=1; i<=10; i=i+2) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("1~" + (i-1) + " 홀수의 합 : " + sum);
	}

}
