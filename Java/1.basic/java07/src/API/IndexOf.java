package API;

public class IndexOf {
	// indexOf() : ���ڿ��� �ε����� ��ȯ���ִ� �޼ҵ�(ó�� ������ ���ڸ� ã��)
	//				�־��� ���ڿ� ���� �� -1 ��ȯ
	public static void main(String[] args) {
		
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");	// ù��° ������ "��"�� �ε��� ��ȯ
		System.out.println(location);
		
		if (subject.indexOf("�ڹ�") != -1) {			// �־��� ���ڿ��� ������
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
		
	}
	
}
