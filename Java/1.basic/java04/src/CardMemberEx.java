import java.util.Scanner;

public class CardMemberEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, cardNum, gender, job;
		int age, count, price, num;
		
		System.out.print("ȸ�� �� �Է� : ");
		num = sc.nextInt();
		
		CardMember[] cm = new CardMember[num];
		
		System.out.print("\n****ȸ�� ���� �Է�****");
		for (int i=0; i<cm.length; i++) {
			System.out.print("\nȸ����" + (i+1) + " : ");
			name = sc.next();
			
			System.out.print("ī���ȣ : ");
			cardNum = sc.next();
			
			System.out.print("���� : ");
			age = sc.nextInt();
			
			System.out.print("���� : ");
			gender = sc.next();
			
			System.out.print("���� : ");
			job = sc.next();
			
			System.out.print("ī�� �̿� Ƚ�� : ");
			count = sc.nextInt();
			
			System.out.print("�� ��� �ݾ� : ");
			price = sc.nextInt();
			
			cm[i] = new CardMember(name, cardNum, age, gender, job, count, price);
		}
		
		System.out.println("\n****ȸ�� ���� ���****\n");
		for (int i=0; i<cm.length; i++) {
			cm[i].showcardinfo();
			System.out.println();
		}
		
		sc.close();

	}

}
