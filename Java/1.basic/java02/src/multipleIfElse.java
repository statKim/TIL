// else if �κ��� ���� ��쿡�� switch�� ���!!!
import java.util.Scanner;

public class KHSmultipleIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.print("���� �Է� (0~100) : ");
		int score = sc.nextInt();
		
		// ���๮ �ϳ��� ���� {} ���ص� ��
		if (score>=90)
			grade = 'A';
		else if (score>=80)
			grade = 'B';
		else if (score>=70)
			grade = 'C';
		else if (score>=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("���� : " + grade);
		
		sc.close();

	}

}
