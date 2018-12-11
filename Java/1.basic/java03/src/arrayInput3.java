import java.util.Scanner;
public class KHSarrayInput3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		int sum = 0;
		double avg;	// float으로 해도 됨
		
		System.out.println("점수 입력");

		for (int i=0; i<scores.length; i++) {
			System.out.print("학생" + (i+1) + " : ");
			scores[i] = sc.nextInt();
			sum = sum + scores[i];
		}
		
		avg = (double)sum / scores.length;
		//avg = sum / (double)scores.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		sc.close();
	}

}
