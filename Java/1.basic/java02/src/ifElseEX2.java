import java.util.Scanner;

public class KHSifElseEX2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 값 입력 받음(num1, num2, num3)
		System.out.print("숫자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("숫자3 입력 : ");
		int num3 = sc.nextInt();
		
		int max_val;
		
		if ((num1>num2) && (num1>num2))
			max_val = num1;
		else if ((num2>num1) && (num2>num3)) // (num2>num3)만 해도 됨
			max_val = num2;
		else
			max_val = num3;
		
//		//이렇게 해도 됨!!
//		if ((num1>num2) && (num1>num2))
//			max_val = num1;
//		else	// 즉 num1이 제일 크다는 것이 아닐 때
//			if (num2>num3)
//				max_val = num2;
//			else
//				max_val = num3;
		
		System.out.println("가장 큰 수 : " + max_val);
		
		sc.close();

	}

}
