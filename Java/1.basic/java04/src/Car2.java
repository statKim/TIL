
public class Car2 {

	String model;
	int speed;
	
	//������
	Car2(String model) {
		this.model = model;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i=10; i<=50; i=i+10) {
			this.setSpeed(i);
			//setSpeed(i);	// ���⼭�� ���� this.�� �� �ʿ䰡 ����
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed	
								+ "km/h)");
		}
	}

}
