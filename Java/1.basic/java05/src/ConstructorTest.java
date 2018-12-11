class A {
	public A() {
		System.out.println("�⺻ ������ A");
	}
	
	public A(int x) {
		System.out.println("�Ű����� ������ A : " + x);
	}
}

class B extends A {
	public B() {
		System.out.println("�⺻ ������ B");
	}
	
	public B(int x) {
		super(x);	// super()�� this()ó�� ù �࿡ ���
		System.out.println("�Ű����� ������ B : " + x);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		B b = new B(5);
	}

	
}
