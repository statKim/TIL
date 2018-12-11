package game_project.start;

import java.util.Scanner;

import game_project.game.GaBaBo;
import game_project.game.Guess;
import game_project.info.AppInfo;
import game_project.login.LoginCheck;

public class AppStart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menuNum;
		
		System.out.println("******************************");
		System.out.println("\t★★게임에 오신 것을 환영합니다^^");
		System.out.println("******************************");
		
		LoginCheck lc = new LoginCheck();
		String loginResult;
		loginResult = lc.input();
		
		System.out.println("******************************");
		if (loginResult.equals("")) {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		} else {
			System.out.println(loginResult + "님 환영합니다! 메뉴에서 선택하세요.");
			System.out.println("******************************");
			
			do {
				System.out.println("\t\t메뉴");
				System.out.println("---------------------------");
				System.out.println("1. 애플리케이션 정보");
				System.out.println("2. 가위바위보 게임");
				System.out.println("3. 숫자 알아맞히기 게임");
				System.out.println("4. 종료");
				System.out.println("---------------------------");
				
				System.out.print("메뉴 번호 입력 : ");
				menuNum = sc.nextInt();
				
				switch (menuNum) {
					case 1 :
						AppInfo info = new AppInfo();
						info.showAppInfo();
						break;
					case 2 : 
						System.out.println("**************************");
						System.out.println("\t\t가위바위보 게임");
						GaBaBo gbb = new GaBaBo();
						gbb.play();
						break;
					case 3 : 
						System.out.println("**************************");
						System.out.println("\t\t숫자 알아맞히기 게임");
						Guess g = new Guess();
						g.play();
						break;
					case 4 : //switch문 빠져나가서 종료 출력
						break;
					default :
						System.out.println("잘못 입력하였습니다. 다시 입력하세요");
				}
				
			} while(menuNum !=4);
		}
		System.out.println("*****************************");
		System.out.println("종료합니다!");
		System.out.println("*****************************");
		sc.close();		
	}

}
