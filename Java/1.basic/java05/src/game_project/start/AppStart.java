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
		System.out.println("\t�ڡڰ��ӿ� ���� ���� ȯ���մϴ�^^");
		System.out.println("******************************");
		
		LoginCheck lc = new LoginCheck();
		String loginResult;
		loginResult = lc.input();
		
		System.out.println("******************************");
		if (loginResult.equals("")) {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println(loginResult + "�� ȯ���մϴ�! �޴����� �����ϼ���.");
			System.out.println("******************************");
			
			do {
				System.out.println("\t\t�޴�");
				System.out.println("---------------------------");
				System.out.println("1. ���ø����̼� ����");
				System.out.println("2. ���������� ����");
				System.out.println("3. ���� �˾Ƹ����� ����");
				System.out.println("4. ����");
				System.out.println("---------------------------");
				
				System.out.print("�޴� ��ȣ �Է� : ");
				menuNum = sc.nextInt();
				
				switch (menuNum) {
					case 1 :
						AppInfo info = new AppInfo();
						info.showAppInfo();
						break;
					case 2 : 
						System.out.println("**************************");
						System.out.println("\t\t���������� ����");
						GaBaBo gbb = new GaBaBo();
						gbb.play();
						break;
					case 3 : 
						System.out.println("**************************");
						System.out.println("\t\t���� �˾Ƹ����� ����");
						Guess g = new Guess();
						g.play();
						break;
					case 4 : //switch�� ���������� ���� ���
						break;
					default :
						System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
				}
				
			} while(menuNum !=4);
		}
		System.out.println("*****************************");
		System.out.println("�����մϴ�!");
		System.out.println("*****************************");
		sc.close();		
	}

}
