
import java.util.Scanner;

public class KHSifElseEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Á¤¼ö ÀÔ·Â : ");
		int val = sc.nextInt();
		
		if (val % 2 == 0) 
			System.out.println("Â¦¼ö");
		else 
			System.out.println("È¦¼ö");
		
		sc.close();
		
	}

}
