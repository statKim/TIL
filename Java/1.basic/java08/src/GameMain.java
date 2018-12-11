import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String id, name, phone, sex, job;
		int age, playnum, point;
		int count;
		
		System.out.print("회원 수 입력 : ");
		count = sc.nextInt();
		
		Game[] game = new Game[count];
		
		for (int i=0; i<count; i++) {
			System.out.print("\n아이디 : ");
			id = sc.next();
			System.out.print("회원명 : ");
			name = sc.next();
			System.out.print("나이 : ");
			age = sc.nextInt();
			System.out.print("연락처 : ");
			phone = sc.next();
			System.out.print("성별 : ");
			sex = sc.next();
			System.out.print("직업 : ");
			job = sc.next();
			System.out.print("게임 플레이 횟수 : ");
			playnum = sc.nextInt();
			System.out.print("누적포인트 : ");
			point = sc.nextInt();
			game[i] = new Game(id,name,age,phone,sex,job,playnum,point);
			
		}
		
		System.out.println("************************누적포인트 등급 내역*********************");
		System.out.println();
		System.out.println("아이디\t회원명\t나이\t연락처\t성별\t직업\t플레이 횟수\t누적포인트\t등급");
		for (int i=0; i<count; i++) {
			game[i].showGameInfo();
		}
		sc.close();

	}

}
