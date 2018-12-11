package MultiThread;

public class MainThreadEx {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();		// user2가 값을 50으로 바꿔버려서 출력이 100이 안나옴
	}

}
