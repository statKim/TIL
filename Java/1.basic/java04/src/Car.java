
public class Car {

	//클래스의 멤버 필드=데이터
	String carNo;
	String carName;
	String carMaker;
	int carYear;
	int carCC;	
	
	//클래스의 멤버 메소드=기능
	public void showCarInfo() {
		System.out.println("차량 번호 : " + carNo);
	}
	
	
	// main 함수
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.carNo = "11가1234";
		c1.showCarInfo();
		
		c2.carNo = "22가5678";
		c2.showCarInfo();

		c3.carNo = "33가1111";
		c3.showCarInfo();
		
	}

}
