import java.util.Scanner;

public class KHSarrayInput4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int max=0, min=Integer.MAX_VALUE;	// 만약 최소값 할 때에는 int 범위의 최대값 지정해서 하면 될듯??
		
		System.out.println("숫자 입력");

		for (int i=0; i<num.length; i++) {
			System.out.print("num[" + i + "] : ");
			num[i] = sc.nextInt();
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		
		System.out.println();
		System.out.print("입력된 값 : ");
		//System.out.println("\n입력된 값 : ");
		
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");		
		}
		
		System.out.println();
		System.out.println("최대값 : " + max);
		//System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		sc.close();

	}

}
