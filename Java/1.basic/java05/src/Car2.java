
public class Car2 {

	private String carNo, carName, carMaker;
	private int carYear;
	
	//������
	public Car2(String carNo, String carName, 
				String carMaker, int carYear) {
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
		this.carYear = carYear;
	}
	
	public void showCar() {
		System.out.println("������ȣ : " + carNo);
		System.out.println("���� : " + carName);
		System.out.println("������ : " + carMaker);
		System.out.println("���� : " + carYear);
	}
	
}
