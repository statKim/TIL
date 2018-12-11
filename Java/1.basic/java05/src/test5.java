import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("알파벳 한 문자 입력 : ");
		char ch = sc.next().charAt(0);
		int c = (int)ch;
		
		for (int i=0; i<c-96; i++) {
			for (int j=0; j<c-96-i; j++) {
				System.out.print((char)(j+97));
			}
			System.out.println();
		sc.close();	

		}

	}
}
