
public class Manager2 extends Employee2 {

	private String position; //����
	
	//�Ű����� 4�� �ִ� ������(3���� �θ�Ŭ�������� ����, 1���� �ڽ��� ���)
	//�θ�Ŭ���� �����ڿ��� ������ �Ű������� ���� �޾Ƽ�
	//�θ�Ŭ������ �޼ҵ� ȣ���ϸ鼭 �ʿ��� �� ��ŭ ����
	public Manager2(String empNo, String name, String part, String position) {
		super(empNo, name, part);
		this.position = position; //1���� �ڽ��� ��� �ʱ�ȭ
	}
	
	//��� �ʵ� �� ���
	public void showManagerInfo2() {
		showEmpInfo2(); //�θ�Ŭ������ �޼ҵ� ȣ���Ͽ� ���
		System.out.println("���� : " + position);
	}
	
}
