
public class Employee2 {

	private String empNo, name, part; //���, ����, �μ�
	
	//�Ű����� 3�� �ִ� ������
	//�ڽ� Ŭ������ �����ڷκ��� �Ű����� ���� �޾Ƽ� ��� �ʵ� �ʱ�ȭ
	public Employee2(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	//��� �ʵ� �� ���
	public void showEmpInfo2() {
		System.out.println("��� : " + empNo);
		System.out.println("���� : " + name);
		System.out.println("�μ� : " + part);
	}
	
}
