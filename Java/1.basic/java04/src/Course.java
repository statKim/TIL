import java.util.Scanner;

public class Course {

	Scanner sc = new Scanner(System.in);
	
	String subject, name;
	int grade, num;
	
	public void input() {
		System.out.print("\n과목명 : ");
		subject = sc.next();
		System.out.print("교수 : ");
		name = sc.next();
		System.out.print("학년 : ");
		grade = sc.nextInt();
		System.out.print("이수 학점 : ");
		num = sc.nextInt();
	}
	
	public void output() {
		System.out.print(subject + " ");
		System.out.print(name + " ");
		System.out.print(grade + "학년 ");
		System.out.print(num + "학점\n");
	}

}
