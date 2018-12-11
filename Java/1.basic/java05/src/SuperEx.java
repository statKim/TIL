class SuperClass {
	int x;
	public SuperClass() {	// 생성자
		x = 5;
	}
}

class SubClass extends SuperClass {	//상속
	int x;
	
	public SubClass() {	//생성자
		x = 10;
	}
	
	public void show() {
		//this.x : 자신의 클래스 내 객체 내에서 객체 자신의 멤버 필드 x
		System.out.println("this.x : " + this.x);
		//super.x : 부모클래스의 멤버 필드 x
		System.out.println("super.x : " + super.x);
	}
}

public class SuperEx {

	public static void main(String[] args) {

		SubClass sc = new SubClass();
		sc.show();
		
	}

}
