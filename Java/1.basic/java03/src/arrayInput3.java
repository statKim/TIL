import java.util.Scanner;
public class KHSarrayInput3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		int sum = 0;
		double avg;	// float���� �ص� ��
		
		System.out.println("���� �Է�");

		for (int i=0; i<scores.length; i++) {
			System.out.print("�л�" + (i+1) + " : ");
			scores[i] = sc.nextInt();
			sum = sum + scores[i];
		}
		
		avg = (double)sum / scores.length;
		//avg = sum / (double)scores.length;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
		sc.close();
	}

}
