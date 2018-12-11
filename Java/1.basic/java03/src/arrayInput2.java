import java.util.Scanner;

public class KHSarrayInput2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		
		System.out.println("이름 입력");
		for (int i=0; i<name.length; i++) {
			System.out.print("name[" + i + "] : ");
			name[i] = sc.next();
		}
		
		System.out.println("");
		System.out.println("입력된 값 출력");
		for (int i=0; i<name.length; i++) {
			System.out.println("name[" + i + "] = " + name[i]);
		}
		
		sc.close();

	}

}
