// else if 부분이 많은 경우에는 switch문 사용!!!
import java.util.Scanner;

public class KHSmultipleIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.print("정수 입력 (0~100) : ");
		int score = sc.nextInt();
		
		// 실행문 하나일 때는 {} 안해도 됨
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
		
		System.out.println("성적 : " + grade);
		
		sc.close();

	}

}
