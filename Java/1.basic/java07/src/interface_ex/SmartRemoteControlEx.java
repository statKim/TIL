package interface_ex;

public class SmartRemoteControlEx {
	
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		// RemoteControl ��ü ����
		RemoteControl rc = tv;
		
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		//Searchable ��ü ����
		Searchable searchable = tv;
		searchable.search("www.naver.com");
		
	}

}
