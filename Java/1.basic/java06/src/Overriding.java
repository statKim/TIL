class Parent {
	private int x = 10;
	
	public void show() {
		System.out.println("Parent 클래스 x : " + x);
	}
}

class Child extends Parent {
	private int x = 20;
	
	//@Override // 생략 가능하나 쓰는것이 좋음
	public void show() {
		System.out.println("Child 클래스 x : " + x);
	}
}

public class Overriding {
	
	public static void main (String[] args) {
		Parent p = new Parent();
		p.show();	// 부모클래스의 메소드
		
		Child c = new Child();	// 자동 오버라이딩(@Override 안해도 이름 같아서 됨)
		c.show();	// 자식클래스의 메소드
		
		Parent obP = new Child();
		obP.show();	// 자동 오버라이딩 => 자식클래스의 메소드
	}
	
}
