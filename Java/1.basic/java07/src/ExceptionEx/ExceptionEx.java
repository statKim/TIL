package ExceptionEx;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int n2 = sc.nextInt();
		
		// 에러날 것으로 예상되는 문장만 try문에 넣음
		try {
			int result = n1/n2;
			System.out.println("나누기 결과 : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		sc.close();
	}

}
