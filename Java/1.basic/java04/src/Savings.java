import java.util.Scanner;

public class Savings {

	Scanner sc = new Scanner(System.in);
	
	String name;
	int deposit, interest, balance;
	//  (예금액)	  (이자)		(잔액)
	
	// 초기값 지정하는 메소드
	public void setSavings() {
		name = "홍길동";
		balance = 10000;
	}
	
	// 이름 반환하는 메소드
	public String getName() {
		return name;
	}
	
	// 예금액 입력받고 잔액 계산하는 메소드
	public void inputDeposit() {
		System.out.print("예금액 입력 : ");
		deposit = sc.nextInt();
		balance = balance + deposit;
	}
	
	// 이자 계산, 잔액 계산 후 이자 반환하는 메소드
	public int getInterest() {
		interest = (int)(balance * 0.1);	// 이자
		balance = balance + interest;		// 잔액
		return interest;
	}
	
	// 잔액 반환하는 메소드
	public int getBalance() {
		return balance;
	}
	
}
