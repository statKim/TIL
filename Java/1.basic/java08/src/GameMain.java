import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String id, name, phone, sex, job;
		int age, playnum, point;
		int count;
		
		System.out.print("ȸ�� �� �Է� : ");
		count = sc.nextInt();
		
		Game[] game = new Game[count];
		
		for (int i=0; i<count; i++) {
			System.out.print("\n���̵� : ");
			id = sc.next();
			System.out.print("ȸ���� : ");
			name = sc.next();
			System.out.print("���� : ");
			age = sc.nextInt();
			System.out.print("����ó : ");
			phone = sc.next();
			System.out.print("���� : ");
			sex = sc.next();
			System.out.print("���� : ");
			job = sc.next();
			System.out.print("���� �÷��� Ƚ�� : ");
			playnum = sc.nextInt();
			System.out.print("��������Ʈ : ");
			point = sc.nextInt();
			game[i] = new Game(id,name,age,phone,sex,job,playnum,point);
			
		}
		
		System.out.println("************************��������Ʈ ��� ����*********************");
		System.out.println();
		System.out.println("���̵�\tȸ����\t����\t����ó\t����\t����\t�÷��� Ƚ��\t��������Ʈ\t���");
		for (int i=0; i<count; i++) {
			game[i].showGameInfo();
		}
		sc.close();

	}

}
