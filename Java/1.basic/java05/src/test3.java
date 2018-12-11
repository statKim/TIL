
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			for (int j=i; j<num; j++) {
				System.out.print("*");
			}
			System.out.println();
		sc.close();	
		}

	}

}
