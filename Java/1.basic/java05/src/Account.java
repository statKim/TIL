
public class Account {

	private int balance;
	static final int MIN_BALANCE = 0, MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (!(balance<MIN_BALANCE) && 
			!(balance>MAX_BALANCE)) {
			this.balance = balance;
		}
	}
	
}
