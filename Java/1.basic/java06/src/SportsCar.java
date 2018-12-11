
public class SportsCar extends MyCar {

	@Override
	public void speedUp() {
		speed = speed + 10;
	}
	
	//오버라이딩을 할 수 없음 - 에러 뜸
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
	
}
