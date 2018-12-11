
public class Automobile extends Car2 {

	private String autoManual;
	
	//자식 클래스의 생성자
	public Automobile(String carNo, String carName, 
				String carMaker, int carYear, String autoManual) {
		super(carNo, carName, carMaker, carYear); //부모생성자 호출
		this.autoManual = autoManual;
	}
	
	public void showAutomobile() {
		showCar();
		System.out.println("기어변속 : " + autoManual);
	}
	
}
