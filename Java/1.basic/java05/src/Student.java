
public class Student extends People {

	public int studentNo;	// 일반적으로 private
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	// 부모클래스 생성자
		this.studentNo = studentNo;
	}
	
}
