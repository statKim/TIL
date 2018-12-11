
public class Car2 {

	private String carNo, carName, carMaker;
	private int carYear;
	
	//생성자
	public Car2(String carNo, String carName, 
				String carMaker, int carYear) {
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
		this.carYear = carYear;
	}
	
	public void showCar() {
		System.out.println("차량번호 : " + carNo);
		System.out.println("차종 : " + carName);
		System.out.println("제조사 : " + carMaker);
		System.out.println("연식 : " + carYear);
	}
	
}
