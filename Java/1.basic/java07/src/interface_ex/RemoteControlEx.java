package interface_ex;

public class RemoteControlEx {

	public static void main(String[] args) {
		
		//�������̽� ���
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
		
		//static �޼ҵ� ���
		RemoteControl.changeBattery(); //static �޼ҵ��̱� ������ ��ü�� ���ؼ� �θ��� ����

	}

}
