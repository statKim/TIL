
import java.util.Scanner;

public class KHSifElseEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int val = sc.nextInt();
		
		if (val % 2 == 0) 
			System.out.println("¦��");
		else 
			System.out.println("Ȧ��");
		
		sc.close();
		
	}

}
