
public class MyCar {

	public int speed;
	
	public void speedUp() {
		speed = speed + 1;
	}
	
	//final method
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
	
}
