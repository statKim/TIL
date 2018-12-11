// 문자열 비교
import java.util.Scanner;

public class KHScompareOperator2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String pass = "1234";
		String userPass;
		
		System.out.print("비밀번호 입력 : ");
		userPass = sc.next();
		
		// 문자열을 비교할 때는 "==" 말고 equals() method 사용
		if (pass.equals(userPass))	// pass와 userPass를 비교
			System.out.println("PASS");
		else
			System.out.println("NO PASS");
		
		sc.close();

	}

}
