// 시작값과 마지막값을 받아서 그 사이의 합을 구하는 프로그램
import java.util.Scanner;

public class KHSforEx3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("start 입력 : ");
		int start = sc.nextInt();
		System.out.print("end 입력 : ");
		int end = sc.nextInt();
		
		int sum = 0;
		for (int i=start; i<=end; i++) {
			sum = sum + i;
		}
		
		System.out.println(start + " ~ " + end + "의 합 : " + sum);
		
		sc.close();
		
	}

}
