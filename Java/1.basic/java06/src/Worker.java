
public class Worker {

	String joominNo, name;
	
	public Worker(String joominNo, String name) {
		this.joominNo = joominNo;
		this.name = name;
	}
	
	public void showWorkerInfo() {
		System.out.println("**�Ƹ�����Ʈ�� �޿� ���� ����**");
		System.out.println("�ֹι�ȣ : " + joominNo);
		System.out.println("���� : " + name);
	}
	
}
