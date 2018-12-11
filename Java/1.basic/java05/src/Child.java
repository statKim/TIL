
public class Child extends Parent {

	private int c;
	
	public void setChild() {
		c = 20;
	}
	
	public void showChild() {
		showParent();	// 부모클래스의 메소드 사용
		System.out.println("자식클래스 c : " + c);
	}
	
}
