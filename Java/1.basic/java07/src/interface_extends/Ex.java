package interface_extends;

public class Ex {

	public static void main(String[] args) {

		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); //���� - InterfaceA �����̱� ������ methodA()�� ���� ����
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;	// �ڽ� �������̽�!!
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
