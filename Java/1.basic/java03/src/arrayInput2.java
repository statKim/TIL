import java.util.Scanner;

public class KHSarrayInput2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		
		System.out.println("�̸� �Է�");
		for (int i=0; i<name.length; i++) {
			System.out.print("name[" + i + "] : ");
			name[i] = sc.next();
		}
		
		System.out.println("");
		System.out.println("�Էµ� �� ���");
		for (int i=0; i<name.length; i++) {
			System.out.println("name[" + i + "] = " + name[i]);
		}
		
		sc.close();

	}

}
