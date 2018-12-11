package interface_ex;

public class SmartRemoteControlEx {
	
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		// RemoteControl °´Ã¼ ¸¸µë
		RemoteControl rc = tv;
		
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		//Searchable °´Ã¼ ¸¸µë
		Searchable searchable = tv;
		searchable.search("www.naver.com");
		
	}

}
