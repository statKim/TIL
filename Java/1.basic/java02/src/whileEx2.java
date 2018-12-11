import java.util.Scanner;

public class KHSwhileEx2 {

	public static void main(String[] args) {
		
		int count, score, i=1, sum=0;
		float average;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		count = sc.nextInt();
		
		while (i<=count) {
			System.out.print("학생" + i + " 점수 입력 : ");
			score = sc.nextInt();
			sum = sum + score;
			i = i + 1;
		}
		
		average = sum / (float)count;
		
		System.out.println("평균 : " + average);
		
		sc.close();
	}

}
