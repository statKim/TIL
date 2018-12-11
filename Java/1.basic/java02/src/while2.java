import java.util.Scanner;

public class KHSwhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
			
		while (num != 7) {		// 7이 아니면 계속 다시 입력
			System.out.print("다시 입력 : ");
			num = sc.nextInt();
		}

		System.out.println("7 입력. 종료");
		sc.close();
		
	}

}
