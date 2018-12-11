package typecheck;

public class InstanceofEx {
	
	// 원래 Parent인지 확인해서 변환하는 메소드
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1-Child로 변환 성공");
		} else {
			System.out.println("method1-Child로 변환되지 않음");
		}
	}
	
	// 무조건 변환하는 메소드 => 변환시 오류날 수 있음!!!
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2-Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();	//Child 객체(인스턴스) 전달
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();	//Parent 객체(인스턴스) 전달
		method1(parentB);
		//method2(parentB);	// 에러남!!
	}

}
