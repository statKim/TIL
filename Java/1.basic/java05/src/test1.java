import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money, count;
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("금액을 입력하세요(나가기:-1) : ");	
		money = sc.nextInt();
		while (money != -1) {
			for (int i=0; i<unit.length; i++) {
				count = money / unit[i];
				money = money - unit[i]*count;
				System.out.println(unit[i] + "원 : " + count);
			}
			System.out.print("금액을 입력하세요(나가기:-1) : ");
			money = sc.nextInt();
		
		}
		
		System.out.println("종료");
		
		sc.close();

	}

}
