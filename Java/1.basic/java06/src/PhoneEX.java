
public class PhoneEX {

	public static void main(String[] args) {

		//Phone phone = new Phone();	// 사용불가(abstract)
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

	}

}
