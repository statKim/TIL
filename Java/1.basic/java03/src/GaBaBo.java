import java.util.Scanner;

public class KHSGaBaBo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pc, command;
		String[] gababo = {"가위", "바위", "보"};
		String exit;
		
		while (true) {
			System.out.println("\n가위 바위 보 게임 : 1. 가위, 2. 바위, 3. 보");
			System.out.println("==================================");
			pc = (int)(Math.random()*3) + 1;
			System.out.print("번호 입력 : ");
			command = sc.nextInt();
			
//			if (pc==command) {
//				System.out.println("비겼습니다");		
//			} else if (pc==1) {
//				if (command==2)
//					System.out.println("이겼습니다!!");
//				else 
//					System.out.println("졌습니다 ㅠㅠ");
//			} else if (pc==2) {
//				if (command==3)
//					System.out.println("이겼습니다!!");
//				else
//					System.out.println("졌습니다 ㅠㅠ");
//			} else {
//				if (command==1)
//					System.out.println("이겼습니다!!");
//				else
//					System.out.println("졌습니다 ㅠㅠ");
//			}
			
			if ((pc==1 && command==2) ||
				(pc==2 && command==3) ||
				(pc==3 && command==1))
				System.out.println("이겼습니다!!");
			else if (pc==command)
				System.out.println("비겼습니다");
			else
				System.out.println("졌습니다 ㅠㅠ");
			
			System.out.println("컴퓨터는 " + gababo[pc-1] + "입니다.");	// 숫자가 1~3, 배열숫자는 0~3 => -1 해줌
			System.out.print("계속 하시겠습니까? (y/n) : ");
			exit = sc.next();
			if (exit.equals("y")==false) {
				break;
			}
		}
		System.out.println("\n게임을 종료합니다.");
		
		sc.close();
	}

}
