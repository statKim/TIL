import java.util.Scanner;

public class BankApplication {

	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if (selectNo==1) {
				createAccount();
			} else if (selectNo==2) {
				accountList();
			} else if (selectNo==3) {
				deposit();
			} else if (selectNo==4) {
				withdraw();
			} else if (selectNo==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i]==null) {
				System.out.println("-------------");
				System.out.println("계좌생성");
				System.out.println("-------------");
				
				System.out.print("계좌번호 : ");
				String ano = sc.next();
				//accountArray[i].setAno(ano);
				System.out.print("계좌주 : ");
				String owner = sc.next();
				//accountArray[i].setOwner(owner);
				System.out.print("조기입금액 : ");
				int balance = sc.nextInt();
				//accountArray[i].setBalance(balance);
				
				BankAccount a = new BankAccount(ano,owner,balance);
				accountArray[i] = a;
				System.out.print("결과 : 계좌가 생성되었습니다.");
				break;
			//} else {
				//i = i + 1;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i]==null) {
				for (int j=0; j<i; j++) {
					System.out.println(accountArray[j].getAno() + "\t" + 
									accountArray[j].getOwner() + "\t" +
									accountArray[j].getBalance());
				}
				break;
			}
		}
	}
	
	public static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		
		//int i = 0;
//		System.out.print("계좌번호 : ");
//		String num = sc.next();
//		System.out.print("예금액 : ");
//		int money = sc.nextInt();
//		
//		for (int i=0; i<accountArray.length; i++) {
//			if (accountArray[i].getAno().equals(num)) {
//				money = accountArray[i].getBalance() + money;
//				accountArray[i].setBalance(money);
//				System.out.println("결과 : 예금이 성공되었습니다.");
//			}
//		}
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		BankAccount ba = null;
		ba = findAccount(ano);
		System.out.print("예금액 : ");
		int money = sc.nextInt();
		ba.setBalance(ba.getBalance() + money);
		System.out.println("결과 : 예금이 성공되었습니다.");
	}
	
	public static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		BankAccount ba = null;
		ba = BankApplication.findAccount(ano);
		System.out.print("출금액 : ");
		int money = sc.nextInt();
		ba.setBalance(ba.getBalance() - money);
		System.out.println("결과 : 출금이 성공되었습니다.");
		
	}
	
	private static BankAccount findAccount(String ano) {
		//String num = sc.next();
		BankAccount ba = null;
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				ba = accountArray[i];
				break;
			}
		}
		return ba;
	}
	
}
