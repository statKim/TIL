import java.util.Scanner;

public class KHSbreakEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int balance = 100000;
		int withdrawal;

		System.out.println("현재 잔액 : " + balance + "원");
		
		// 무한반복하다가 잔액보다 인출액이 커지면 break
		while (true) {
			System.out.print("인출액 입력 : ");
			withdrawal = sc.nextInt();
			
			if (balance >= withdrawal) {
				balance = balance - withdrawal;
			} else {
				System.out.println("잔액 부족. 현재 잔액 : " + balance);
				break;
			}
		}
		
		sc.close();
		}

}
