package game_project.login;

import java.util.Scanner;

public class LoginCheck {

	Scanner sc = new Scanner(System.in);
	String id, password;
	
	//생성자에서 멤버 필드 초기화
	public LoginCheck() {
		id = "abcd";
		password = "1234";
	}
	
	//아이디, 비밀번호 입력하여 check() 호출하면서 전달
	public String input() {
		String id, password, result; //지역변수
		
		System.out.println("\t\t로그인");
		System.out.println("--------------------------------");
		System.out.print("아이디 입력 : ");
		id = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		password = sc.next();
		
		result = check(id, password);
		return result;		
	}
	
	public String check(String id, String password) {
		if (!this.id.equals(id) || !this.password.equals(password)) {
			return "";	//로그인 실패
		} else {
			return id;	//성공인 경우
		}
	}
	
}
