import java.util.Scanner;
public class KHSTimeCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ð� �Է� (��) : ");
		int sec = sc.nextInt();
		
		int hour = sec / 3600;
		int minute = sec % 3600 / 60;
		int second = sec % 60;

		System.out.println(sec + "�ʴ� " + hour + "�ð�, " + minute + "��, "
				+ second + "���Դϴ�.");
		
		sc.close();

	}

}
