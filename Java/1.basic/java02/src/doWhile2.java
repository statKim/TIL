import java.util.Scanner;

public class KHSdoWhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		String answer = "";
		
		System.out.println("과정 안내 프로그램");
		
		do {
			System.out.print("1~4 번호 입력 : ");
			input = sc.nextInt();	// 정수 입력
			
			switch (input) {
			case 1 : System.out.println("1. 빅데이터 기본 기술"); break;
			case 2 : System.out.println("2. 빅데이터 수집/처리 기술"); break;
			case 3 : System.out.println("3. 빅데이터 분석/시각화"); break;
			case 4 : System.out.println("4. 현장실습 프로젝트"); break;
			default : System.out.println("잘못 입력하였습니다.");
			}
			
			System.out.print("계속 입력하시겠습니까? (y/n 입력) : ");
			answer = sc.next();	// 문자열 입력
		} while (answer.equals("y"));	// 문자열 비교(y면 계속 반복, 아니면 반복문 종료)
		
		System.out.println("종료합니다.");
		sc.close();
		
	}

}
