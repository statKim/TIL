import java.util.Scanner;

public class KHSforEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		//int pos=0, neg=0, zero=0; //이렇게 한 줄에 해도 됨
		int pos = 0;
		int neg = 0;
		int zero = 0;
		
		for (int i=1; i<=10; i++) {
			System.out.print("숫자" + i + " 입력 : ");
			num = sc.nextInt();
			
			if (num > 0)
				pos = pos + 1;
			else if (num < 0)
				neg = neg + 1;
			else
				zero = zero + 1;
		}
		
		System.out.println("\n양수 개수 : " + pos);
		System.out.println("음수 개수 : " + neg);
		System.out.println("0의 개수 : " + zero);
		 
		sc.close();

	}

}
