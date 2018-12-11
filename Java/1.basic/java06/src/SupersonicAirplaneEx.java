
public class SupersonicAirplaneEx {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		//"클래스이름.static 변수"의 notation 사용(static 변수이기 때문)
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();		
	}

}
