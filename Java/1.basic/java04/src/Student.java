import java.util.Scanner;

public class Student {
	
	static Scanner sc = new Scanner(System.in);
	
	int stdNo;	// String���� �ص� ��
	String stdName;
	int year;
	int score;
	
	public void inputStdInfo() {
		System.out.println("\n****�л� ���� �Է�****");
		
		System.out.print("�й� : ");
		stdNo = sc.nextInt();
		
		System.out.print("���� : ");
		stdName = sc.next();
		
		System.out.print("�г� : ");
		year = sc.nextInt();
		
		System.out.print("���� : ");
		score = sc.nextInt();
	}
	
	public void showStdInfo() {
		System.out.println("\n****�л� ���� ���****");		
		System.out.println("�й� : " + stdNo);
		System.out.println("���� : " + stdName);
		System.out.println("�г� : " + year);
		System.out.println("���� : " + score);
	}
	
	
	// main �Լ�
	public static void main(String[] args) {

		Student stud1 = new Student();
		
		stud1.inputStdInfo();
		stud1.showStdInfo();
		
		sc.close();
	}

}
