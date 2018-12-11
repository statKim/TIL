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
	
	//예외 발생 코드를 가지고 있는 메소드
	//자신을 호출한 곳에서 예외를 처리하도록 throws 키워드로 예외를 떠넘긴다
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) { //잔고가 부족하면 예외 발생시킴(예외메시지) 메시지는 예외 객체 내부에 저장
			// 예외 발생시 객체 만들어서 넘겨줌(throw)
			throw new BalanceInsufficientException("잔고부족 : " + (money-balance) + " 모자람");
		}
		balance = balance - money;
	}

}
