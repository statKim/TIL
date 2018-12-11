package poly;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();	// Car 객체 생성
		
		for (int i=0; i<=5; i++) {
			int problemLocation = car.run();
		
			switch (problemLocation) {
				case 1 :
					System.out.println("앞왼쪽 HankookTire로 교체");
					// 부모 객체(Tire)에 자식 객체(HankookTire)를 저장(자동변환됨)
					car.frontLeftTire = new HankookTire("앞왼쪽",15);
					break;	// switch문 빠져나옴
				case 2 :
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽",13);
					break;
				case 3 :
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽",14);
					break;
				case 4 :
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽",17);
					break;
			}
			System.out.println("==========================");
		}
	}

}
