
public class AccountEx {

	public static void main(String[] args) {

		Account ac = new Account();
		
		ac.setBalance(10000);
		System.out.println("���� �ܰ� : " + ac.getBalance());
		
		ac.setBalance(-100);
		System.out.println("���� �ܰ� : " + ac.getBalance());
		
		ac.setBalance(2000000);
		System.out.println("���� �ܰ� : " + ac.getBalance());
		
		ac.setBalance(300000);
		System.out.println("���� �ܰ� : " + ac.getBalance());

	}

}
