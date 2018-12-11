
public class KHSwhileEx1 {

	public static void main(String[] args) {

		int i=0, sum=0;
		
		// 0부터 100까지 2씩 더함!1 => 짝수만 더하게 됨
		while (i<=100) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("1~100 짝수의 합 : " + sum);
	}

}
