
public class Employee2 {

	private String empNo, name, part; //사번, 성명, 부서
	
	//매개변수 3개 있는 생성자
	//자식 클래스의 생성자로부터 매개변수 전달 받아서 멤버 필드 초기화
	public Employee2(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	//멤버 필드 값 출력
	public void showEmpInfo2() {
		System.out.println("사번 : " + empNo);
		System.out.println("성명 : " + name);
		System.out.println("부서 : " + part);
	}
	
}
