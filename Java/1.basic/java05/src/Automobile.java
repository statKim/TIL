
public class Automobile extends Car2 {

	private String autoManual;
	
	//�ڽ� Ŭ������ ������
	public Automobile(String carNo, String carName, 
				String carMaker, int carYear, String autoManual) {
		super(carNo, carName, carMaker, carYear); //�θ������ ȣ��
		this.autoManual = autoManual;
	}
	
	public void showAutomobile() {
		showCar();
		System.out.println("���� : " + autoManual);
	}
	
}
