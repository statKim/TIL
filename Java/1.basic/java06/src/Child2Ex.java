
public class Child2Ex {

	public static void main(String[] args) {

		Child2 ch = new Child2();	//자동 타입 변환
		
		Parent2 pa = ch;
		pa.method1();
		pa.method2();			// 재정의된 Child2의 메소드 호출(Override됐기 때문)
		//pa.method3();			// 호출 불가능(부모클래스에 선언된 필드와 메소드만
								// 			호출 가능!!!)
	}

}
