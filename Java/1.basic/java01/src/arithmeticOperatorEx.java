import java.util.Scanner;
import java.text.DecimalFormat;

public class KHSarithmeticOperatorEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, total;
		float average;	// 평균 실수로 저장
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		System.out.println("====================");
		
		total = kor + eng + math;	// 총점
		System.out.println("총점 : " + total);
		
		average = total / 3.0f;		//float값으로 출력해야하기 때문에 나누는 값을 float형식으로 나눔
									//또는 total을 float로 선언하고 3으로 나눠도 같은 결과가 나옴
		// 소수점 이하 2자리로 조정
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("평균 : " + df.format(average));
		
		sc.close();
		
	}

}
