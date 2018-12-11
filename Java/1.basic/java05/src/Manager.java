
public class Manager extends Employee{

	private String position; // 직위 추가
	
	// 입력받아서 멤버 필드 값 설정
	public void setManager() {
		setEmployee();	// 부모 클래스의 메소드 호출하여 입력
		System.out.print("직위 입력 : ");
		position = sc.next();
	}
	
	// 멤버 필드 값 출력
	public void showManagerInfo() {
		showEmpInfo();	// 부모 클래스의 메소드 호출하여 출력
		System.out.println("직위 : " + position);
	}
	
}
