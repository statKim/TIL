import java.util.Scanner;

public class Course {

	Scanner sc = new Scanner(System.in);
	
	String subject, name;
	int grade, num;
	
	public void input() {
		System.out.print("\n����� : ");
		subject = sc.next();
		System.out.print("���� : ");
		name = sc.next();
		System.out.print("�г� : ");
		grade = sc.nextInt();
		System.out.print("�̼� ���� : ");
		num = sc.nextInt();
	}
	
	public void output() {
		System.out.print(subject + " ");
		System.out.print(name + " ");
		System.out.print(grade + "�г� ");
		System.out.print(num + "����\n");
	}

}
