import java.util.Scanner;

public class KHSGaBaBo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pc, command;
		String[] gababo = {"����", "����", "��"};
		String exit;
		
		while (true) {
			System.out.println("\n���� ���� �� ���� : 1. ����, 2. ����, 3. ��");
			System.out.println("==================================");
			pc = (int)(Math.random()*3) + 1;
			System.out.print("��ȣ �Է� : ");
			command = sc.nextInt();
			
//			if (pc==command) {
//				System.out.println("�����ϴ�");		
//			} else if (pc==1) {
//				if (command==2)
//					System.out.println("�̰���ϴ�!!");
//				else 
//					System.out.println("�����ϴ� �Ф�");
//			} else if (pc==2) {
//				if (command==3)
//					System.out.println("�̰���ϴ�!!");
//				else
//					System.out.println("�����ϴ� �Ф�");
//			} else {
//				if (command==1)
//					System.out.println("�̰���ϴ�!!");
//				else
//					System.out.println("�����ϴ� �Ф�");
//			}
			
			if ((pc==1 && command==2) ||
				(pc==2 && command==3) ||
				(pc==3 && command==1))
				System.out.println("�̰���ϴ�!!");
			else if (pc==command)
				System.out.println("�����ϴ�");
			else
				System.out.println("�����ϴ� �Ф�");
			
			System.out.println("��ǻ�ʹ� " + gababo[pc-1] + "�Դϴ�.");	// ���ڰ� 1~3, �迭���ڴ� 0~3 => -1 ����
			System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
			exit = sc.next();
			if (exit.equals("y")==false) {
				break;
			}
		}
		System.out.println("\n������ �����մϴ�.");
		
		sc.close();
	}

}
