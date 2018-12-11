import java.util.Scanner;
public class KHSTimeCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간 입력 (초) : ");
		int sec = sc.nextInt();
		
		int hour = sec / 3600;
		int minute = sec % 3600 / 60;
		int second = sec % 60;

		System.out.println(sec + "초는 " + hour + "시간, " + minute + "분, "
				+ second + "초입니다.");
		
		sc.close();

	}

}
