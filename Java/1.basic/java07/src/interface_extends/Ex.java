package interface_extends;

public class Ex {

	public static void main(String[] args) {

		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); //에러 - InterfaceA 형식이기 때문에 methodA()만 실행 가능
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;	// 자식 인터페이스!!
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
