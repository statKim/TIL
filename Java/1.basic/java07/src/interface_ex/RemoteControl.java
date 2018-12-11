package interface_ex;
// final, abstract 등 생략해도 자동으로 됨
public interface RemoteControl {
	
	//상수 - final 생략해도 자동으로 생성됨
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 : body가 없는 메소드 - abstract 생략해도 자동으로 생략됨
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 : body 있는 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//static 메소드 - 객체를 통해서 부르지 않음
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
