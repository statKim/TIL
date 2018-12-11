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
		System.out.println("응시자 정보");
		System.out.println("--------------------");
		System.out.println("학번 : " + num);
		System.out.println("성명 : " + name);
		System.out.println("학과 : " + subject);
		System.out.println("학년 : " + grade);
	}
	
	
}
