import java.util.Scanner;

public class KHSarrayInput5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] num = new int[3];
		String[] depart = new String[3];
		
		System.out.println("�л� ���� �Է�\n");
		
		for (int i=0; i<name.length; i++) {
			System.out.print("�л�" + (i+1) + " ���� : ");
			name[i] = sc.next();
			System.out.print("�л�" + (i+1) + " �г� : ");
			num[i] = sc.nextInt();
			System.out.print("�л�" + (i+1) + " �а� : ");
			depart[i] = sc.next();
			System.out.println();
		}
		
		System.out.println("�л� ���� ���");
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i] + " " + num[i] + "�г� " + depart[i]);
		}
		
		sc.close();
	}

}
