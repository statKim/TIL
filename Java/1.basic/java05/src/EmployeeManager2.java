
public class EmployeeManager2 {

	public static void main(String[] args) {

		//자식클래스의 객체(인스턴스) 생성하면서
		//자식클래스의 생성자에게 매개변수 전달
		//이때 부모 클래스에게 전달할 매개변수도 같이 전달
		Manager2 mg = new Manager2("1234","홍길동","마케팅","대리");
		
		mg.showManagerInfo2();
	}

}
