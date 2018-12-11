import java.util.Scanner;

public class KHSswitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("학년 입력 : ");
		year = sc.nextInt();
		
		// switch 안의 변수인 year는 실수가 오면 안됨
		// 정수
		switch(year) {	
		case 1 : System.out.println("1학년"); break;
		case 2 : System.out.println("2학년"); break;
		case 3 : System.out.println("3학년"); break;
		case 4 : System.out.println("4학년"); break;
		default : System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}

}
