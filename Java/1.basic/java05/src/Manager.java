
public class Manager extends Employee{

	private String position; // ���� �߰�
	
	// �Է¹޾Ƽ� ��� �ʵ� �� ����
	public void setManager() {
		setEmployee();	// �θ� Ŭ������ �޼ҵ� ȣ���Ͽ� �Է�
		System.out.print("���� �Է� : ");
		position = sc.next();
	}
	
	// ��� �ʵ� �� ���
	public void showManagerInfo() {
		showEmpInfo();	// �θ� Ŭ������ �޼ҵ� ȣ���Ͽ� ���
		System.out.println("���� : " + position);
	}
	
}
