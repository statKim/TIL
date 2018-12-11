import java.util.Scanner;

public class Student {
	
	static Scanner sc = new Scanner(System.in);
	
	int stdNo;	// String으로 해도 됨
	String stdName;
	int year;
	int score;
	
	public void inputStdInfo() {
		System.out.println("\n****학생 정보 입력****");
		
		System.out.print("학번 : ");
		stdNo = sc.nextInt();
		
		System.out.print("성명 : ");
		stdName = sc.next();
		
		System.out.print("학년 : ");
		year = sc.nextInt();
		
		System.out.print("점수 : ");
		score = sc.nextInt();
	}
	
	public void showStdInfo() {
		System.out.println("\n****학생 정보 출력****");		
		System.out.println("학번 : " + stdNo);
		System.out.println("성명 : " + stdName);
		System.out.println("학년 : " + year);
		System.out.println("점수 : " + score);
	}
	
	
	// main 함수
	public static void main(String[] args) {

		Student stud1 = new Student();
		
		stud1.inputStdInfo();
		stud1.showStdInfo();
		
		sc.close();
	}

}
