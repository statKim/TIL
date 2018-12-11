
public class Manager2 extends Employee2 {

	private String position; //직위
	
	//매개변수 4개 있는 생성자(3개는 부모클래스에게 전달, 1개는 자신이 사용)
	//부모클래스 생성자에게 전달할 매개변수도 같이 받아서
	//부모클래스의 메소드 호출하면서 필요한 수 만큼 전달
	public Manager2(String empNo, String name, String part, String position) {
		super(empNo, name, part);
		this.position = position; //1개는 자신의 멤버 초기화
	}
	
	//멤버 필드 값 출력
	public void showManagerInfo2() {
		showEmpInfo2(); //부모클래스의 메소드 호출하여 출력
		System.out.println("직위 : " + position);
	}
	
}
