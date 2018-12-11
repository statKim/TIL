import java.util.Scanner;

public class KHSarrayInput5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] num = new int[3];
		String[] depart = new String[3];
		
		System.out.println("학생 정보 입력\n");
		
		for (int i=0; i<name.length; i++) {
			System.out.print("학생" + (i+1) + " 성명 : ");
			name[i] = sc.next();
			System.out.print("학생" + (i+1) + " 학년 : ");
			num[i] = sc.nextInt();
			System.out.print("학생" + (i+1) + " 학과 : ");
			depart[i] = sc.next();
			System.out.println();
		}
		
		System.out.println("학생 정보 출력");
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i] + " " + num[i] + "학년 " + depart[i]);
		}
		
		sc.close();
	}

}
