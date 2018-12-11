import java.util.Scanner;

public class KHSexercise09 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;	// ����Ϸ��� �޸� �������ְ� �ؾ���!!
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = sc.nextInt();
				
			} else if (selectNo == 2) {
				scores = new int[studentNum];	// �޸� �����������!!!
				for (int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
				
			} else if (selectNo == 3) {
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
				
			} else if (selectNo == 4) {
				int max = 0, sum = 0;
				for (int i=0; i<scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum = sum + scores[i];
				}
				double avg = sum / (double)scores.length;
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
				
			} else if (selectNo == 5) {
				run = false;
			}
			
		}
		
		System.out.println("���α׷� ����");
		sc.close();
	}

}
