package interface_ex;
// final, abstract �� �����ص� �ڵ����� ��
public interface RemoteControl {
	
	//��� - final �����ص� �ڵ����� ������
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼ҵ� : body�� ���� �޼ҵ� - abstract �����ص� �ڵ����� ������
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ� : body �ִ� �޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//static �޼ҵ� - ��ü�� ���ؼ� �θ��� ����
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
