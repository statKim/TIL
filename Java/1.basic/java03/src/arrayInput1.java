import java.util.Scanner;

public class KHSarrayInput1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("숫자 입력");
		for (int i=0; i<num.length; i++) {
			System.out.print("num[" + i + "] : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("");
		System.out.println("입력된 값 출력");
		for (int i=0; i<num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
		
		sc.close();

	}

}
