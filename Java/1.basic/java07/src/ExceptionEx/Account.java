package ExceptionEx;

public class Account {
	
	private long balance;
	
	public Account() { }
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance = balance + money;
	}
	
	//���� �߻� �ڵ带 ������ �ִ� �޼ҵ�
	//�ڽ��� ȣ���� ������ ���ܸ� ó���ϵ��� throws Ű����� ���ܸ� ���ѱ��
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) { //�ܰ� �����ϸ� ���� �߻���Ŵ(���ܸ޽���) �޽����� ���� ��ü ���ο� ����
			// ���� �߻��� ��ü ���� �Ѱ���(throw)
			throw new BalanceInsufficientException("�ܰ���� : " + (money-balance) + " ���ڶ�");
		}
		balance = balance - money;
	}

}
