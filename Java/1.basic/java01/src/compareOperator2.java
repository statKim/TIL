// ���ڿ� ��
import java.util.Scanner;

public class KHScompareOperator2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String pass = "1234";
		String userPass;
		
		System.out.print("��й�ȣ �Է� : ");
		userPass = sc.next();
		
		// ���ڿ��� ���� ���� "==" ���� equals() method ���
		if (pass.equals(userPass))	// pass�� userPass�� ��
			System.out.println("PASS");
		else
			System.out.println("NO PASS");
		
		sc.close();

	}

}
