import java.util.Scanner;

public class KHSdoWhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		String answer = "";
		
		System.out.println("���� �ȳ� ���α׷�");
		
		do {
			System.out.print("1~4 ��ȣ �Է� : ");
			input = sc.nextInt();	// ���� �Է�
			
			switch (input) {
			case 1 : System.out.println("1. ������ �⺻ ���"); break;
			case 2 : System.out.println("2. ������ ����/ó�� ���"); break;
			case 3 : System.out.println("3. ������ �м�/�ð�ȭ"); break;
			case 4 : System.out.println("4. ����ǽ� ������Ʈ"); break;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n �Է�) : ");
			answer = sc.next();	// ���ڿ� �Է�
		} while (answer.equals("y"));	// ���ڿ� ��(y�� ��� �ݺ�, �ƴϸ� �ݺ��� ����)
		
		System.out.println("�����մϴ�.");
		sc.close();
		
	}

}
