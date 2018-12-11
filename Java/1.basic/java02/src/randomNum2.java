import java.util.Random;
public class KHSrandomNum2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		for (int i=1; i<=10; i++) {
			int num = r.nextInt(10) + 1;
			System.out.println(num);
		}

	}

}
