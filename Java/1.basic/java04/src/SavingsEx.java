
public class SavingsEx {

	public static void main(String[] args) {
		
		Savings sv = new Savings();
		
		sv.setSavings();
		System.out.println("������ : " + sv.getName());
		System.out.println("�Ա��� �ܾ� : " + sv.getBalance());		
		sv.inputDeposit();
		System.out.println("���� : " + sv.getInterest());		
		System.out.println("���� �ܾ� : " + sv.getBalance());
		
	}

}
