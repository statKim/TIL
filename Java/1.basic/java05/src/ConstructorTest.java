class A {
	public A() {
		System.out.println("기본 생성자 A");
	}
	
	public A(int x) {
		System.out.println("매개변수 생성자 A : " + x);
	}
}

class B extends A {
	public B() {
		System.out.println("기본 생성자 B");
	}
	
	public B(int x) {
		super(x);	// super()도 this()처럼 첫 행에 기술
		System.out.println("매개변수 생성자 B : " + x);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		B b = new B(5);
	}

	
}
