import java.util.Scanner;

public class KHSdoWhile1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, sum=0;
		
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			sum = sum + num;
		} while (num!=0);	// 0아니면 계속 반복
		
		System.out.println("0 입력. 반복문 종료");
		System.out.println("입력한 숫자 종합 : " + sum);
		
		sc.close();
		
	}

}
