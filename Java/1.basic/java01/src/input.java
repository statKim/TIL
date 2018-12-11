// input값 받는 방법!!!
import java.util.Scanner;

public class KHSinput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("첫번째 숫자 입력 : ");		//  print()는 줄 안바꾸고 바로 옆으로 값 받을 수 있음
		num1 = sc.nextInt();	// 입력한 값을 정수로 반환하여 num1에 저장
		
		System.out.print("두번째 숫자 입력 : ");
		num2 = sc.nextInt();
		
		System.out.println("=====================");
		System.out.println("두 수의 합 : " + (num1 + num2));
		System.out.println("두 수의 곱 : " + (num1 * num2));
		
		sc.close(); // 리소스 낭비를 막기 위해 닫기

	}

}
