import java.util.Scanner;

public class Savings {

	Scanner sc = new Scanner(System.in);
	
	String name;
	int deposit, interest, balance;
	//  (���ݾ�)	  (����)		(�ܾ�)
	
	// �ʱⰪ �����ϴ� �޼ҵ�
	public void setSavings() {
		name = "ȫ�浿";
		balance = 10000;
	}
	
	// �̸� ��ȯ�ϴ� �޼ҵ�
	public String getName() {
		return name;
	}
	
	// ���ݾ� �Է¹ް� �ܾ� ����ϴ� �޼ҵ�
	public void inputDeposit() {
		System.out.print("���ݾ� �Է� : ");
		deposit = sc.nextInt();
		balance = balance + deposit;
	}
	
	// ���� ���, �ܾ� ��� �� ���� ��ȯ�ϴ� �޼ҵ�
	public int getInterest() {
		interest = (int)(balance * 0.1);	// ����
		balance = balance + interest;		// �ܾ�
		return interest;
	}
	
	// �ܾ� ��ȯ�ϴ� �޼ҵ�
	public int getBalance() {
		return balance;
	}
	
}
