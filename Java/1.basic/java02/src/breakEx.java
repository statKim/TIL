import java.util.Scanner;

public class KHSbreakEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int balance = 100000;
		int withdrawal;

		System.out.println("���� �ܾ� : " + balance + "��");
		
		// ���ѹݺ��ϴٰ� �ܾ׺��� ������� Ŀ���� break
		while (true) {
			System.out.print("����� �Է� : ");
			withdrawal = sc.nextInt();
			
			if (balance >= withdrawal) {
				balance = balance - withdrawal;
			} else {
				System.out.println("�ܾ� ����. ���� �ܾ� : " + balance);
				break;
			}
		}
		
		sc.close();
		}

}
