package game_project.login;

import java.util.Scanner;

public class LoginCheck {

	Scanner sc = new Scanner(System.in);
	String id, password;
	
	//�����ڿ��� ��� �ʵ� �ʱ�ȭ
	public LoginCheck() {
		id = "abcd";
		password = "1234";
	}
	
	//���̵�, ��й�ȣ �Է��Ͽ� check() ȣ���ϸ鼭 ����
	public String input() {
		String id, password, result; //��������
		
		System.out.println("\t\t�α���");
		System.out.println("--------------------------------");
		System.out.print("���̵� �Է� : ");
		id = sc.next();
		
		System.out.print("��й�ȣ �Է� : ");
		password = sc.next();
		
		result = check(id, password);
		return result;		
	}
	
	public String check(String id, String password) {
		if (!this.id.equals(id) || !this.password.equals(password)) {
			return "";	//�α��� ����
		} else {
			return id;	//������ ���
		}
	}
	
}
