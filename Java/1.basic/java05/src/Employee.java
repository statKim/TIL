import java.util.Scanner;

public class Employee {

	Scanner sc = new Scanner(System.in);
	
	private String empNo, name, part;	// ���, ����, �μ�
	
	// �Է¹޾Ƽ� ��� �ʵ� �� ����
	public void setEmployee() {
		System.out.print("��� �Է� : ");
		empNo = sc.next();
		System.out.print("���� �Է� : ");
		name = sc.next();
		System.out.print("�μ� �Է� : ");
		part = sc.next();
	}
	
	// ��� �ʵ� �� ���
	public void showEmpInfo() {
		System.out.println("\n******************");
		System.out.println("��� : " + empNo);
		System.out.println("���� : " + name);
		System.out.println("�μ� : " + part);
	}
	
}
