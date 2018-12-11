import java.util.Scanner;
public class KHSarrayEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int temp;	// 순서 바꿀 때 임시로 사용하는 변수
		
		System.out.println("숫자 입력");

		for (int i=0; i<num.length; i++) {
			System.out.print("num[" + i + "] 입력 : ");
			num[i] = sc.nextInt();
		}
		
		System.out.print("\n정렬 전 : \t");
		for (int i=0; i<num.length; i++) {
			System.out.print("\t" + num[i]);
		}
		
		System.out.print("\n오름차순 정렬 : ");
		for (int i=0; i<num.length-1; i++) {	// 자기자신과 비교할 필요X => 전체길이-1
			for (int j=i+1; j<num.length; j++) {
				if (num[i]>num[j]) {
					temp = num[i];		// 순서 바꾸기 위해 임시로 만들어놓은 변수
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.print("\t" + num[i]);
		}
		
		System.out.print("\n내림차순 정렬 : ");
		for (int i=0; i<num.length-1; i++) {
			for (int j=i+1; j<num.length; j++) {
				if (num[i]<num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.print("\t" + num[i]);
		}
		sc.close();
	}

}
