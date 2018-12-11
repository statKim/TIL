
public class SavingsEx {

	public static void main(String[] args) {
		
		Savings sv = new Savings();
		
		sv.setSavings();
		System.out.println("예금주 : " + sv.getName());
		System.out.println("입금전 잔액 : " + sv.getBalance());		
		sv.inputDeposit();
		System.out.println("이자 : " + sv.getInterest());		
		System.out.println("최종 잔액 : " + sv.getBalance());
		
	}

}
