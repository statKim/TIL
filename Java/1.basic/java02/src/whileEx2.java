import java.util.Scanner;

public class KHSwhileEx2 {

	public static void main(String[] args) {
		
		int count, score, i=1, sum=0;
		float average;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� �� �Է� : ");
		count = sc.nextInt();
		
		while (i<=count) {
			System.out.print("�л�" + i + " ���� �Է� : ");
			score = sc.nextInt();
			sum = sum + score;
			i = i + 1;
		}
		
		average = sum / (float)count;
		
		System.out.println("��� : " + average);
		
		sc.close();
	}

}
