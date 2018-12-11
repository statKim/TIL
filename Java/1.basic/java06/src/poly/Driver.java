package poly;

public class Driver {

	// Vehicle 타입의 객체를 받음
	// 자식 클래스는 자동타입변환되기 때문에 가능
	public void drive(Vehicle vehicle) {	
		vehicle.run();
	}
	
}
