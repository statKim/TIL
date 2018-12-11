package interface_ex;

public class RemoteControlEx {

	public static void main(String[] args) {
		
		//인터페이스 사용
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.setMute(true);
		rc.turnOff();
		
		//static 메소드 사용
		RemoteControl.changeBattery(); //static 메소드이기 때문에 객체를 통해서 부르지 않음

	}

}
