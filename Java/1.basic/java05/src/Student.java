
public class Student extends People {

	public int studentNo;	// �Ϲ������� private
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	// �θ�Ŭ���� ������
		this.studentNo = studentNo;
	}
	
}
