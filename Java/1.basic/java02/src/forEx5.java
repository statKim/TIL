import java.util.Scanner;

public class KHSforEx5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count, score;
		int sum = 0;
		float average;
		
		System.out.print("�л� �� �Է� : ");
		count = sc.nextInt();
		
		for (int i=1; i<=count; i++) {
			System.out.print("�л�" + i + " ���� �Է� : ");
			score = sc.nextInt();
			sum = sum + score;
		}
		
		average = ((float)sum)/count;
				
		System.out.println("��� : " + average);
		
		sc.close();
	}

}
