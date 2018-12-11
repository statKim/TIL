import java.util.Scanner;

public class BankApplication {

	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------------");
			System.out.print("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i]==null) {
				System.out.println("-------------");
				System.out.println("���»���");
				System.out.println("-------------");
				
				System.out.print("���¹�ȣ : ");
				String ano = sc.next();
				//accountArray[i].setAno(ano);
				System.out.print("������ : ");
				String owner = sc.next();
				//accountArray[i].setOwner(owner);
				System.out.print("�����Աݾ� : ");
				int balance = sc.nextInt();
				//accountArray[i].setBalance(balance);
				
				BankAccount a = new BankAccount(ano,owner,balance);
				accountArray[i] = a;
				System.out.print("��� : ���°� �����Ǿ����ϴ�.");
				break;
			//} else {
				//i = i + 1;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("-------------");
		
		//int i = 0;
//		System.out.print("���¹�ȣ : ");
//		String num = sc.next();
//		System.out.print("���ݾ� : ");
//		int money = sc.nextInt();
//		
//		for (int i=0; i<accountArray.length; i++) {
//			if (accountArray[i].getAno().equals(num)) {
//				money = accountArray[i].getBalance() + money;
//				accountArray[i].setBalance(money);
//				System.out.println("��� : ������ �����Ǿ����ϴ�.");
//			}
//		}
		
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		BankAccount ba = null;
		ba = findAccount(ano);
		System.out.print("���ݾ� : ");
		int money = sc.nextInt();
		ba.setBalance(ba.getBalance() + money);
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
	}
	
	public static void withdraw() {
		System.out.println("-------------");
		System.out.println("���");
		System.out.println("-------------");
		
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		BankAccount ba = null;
		ba = BankApplication.findAccount(ano);
		System.out.print("��ݾ� : ");
		int money = sc.nextInt();
		ba.setBalance(ba.getBalance() - money);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
		
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
