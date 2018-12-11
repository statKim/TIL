import java.util.Scanner;

public class KHSexercise09 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;	// 사용하려면 메모리 지정해주고 해야함!!
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				
			} else if (selectNo == 2) {
				scores = new int[studentNum];	// 메모리 지정해줘야함!!!
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
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				
			} else if (selectNo == 5) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}

}
