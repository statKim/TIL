package info;

public class PersonalInfo {
	
	String name, subject;
	int num, grade;
	
	public PersonalInfo(String name, String subject, int num, int grade) {
		this.name = name;
		this.subject = subject;
		this.num = num;
		this.grade = grade;
	}
	
	public void showInfo() {
		System.out.println("������ ����");
		System.out.println("--------------------");
		System.out.println("�й� : " + num);
		System.out.println("���� : " + name);
		System.out.println("�а� : " + subject);
		System.out.println("�г� : " + grade);
	}
	
	
}
