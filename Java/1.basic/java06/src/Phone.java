
public abstract class Phone {	// �߻�Ŭ����!!
	
	public String owner;
	
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}

}
