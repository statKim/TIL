
public class Car {

	//Ŭ������ ��� �ʵ�=������
	String carNo;
	String carName;
	String carMaker;
	int carYear;
	int carCC;	
	
	//Ŭ������ ��� �޼ҵ�=���
	public void showCarInfo() {
		System.out.println("���� ��ȣ : " + carNo);
	}
	
	
	// main �Լ�
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.carNo = "11��1234";
		c1.showCarInfo();
		
		c2.carNo = "22��5678";
		c2.showCarInfo();

		c3.carNo = "33��1111";
		c3.showCarInfo();
		
	}

}
