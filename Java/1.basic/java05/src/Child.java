
public class Child extends Parent {

	private int c;
	
	public void setChild() {
		c = 20;
	}
	
	public void showChild() {
		showParent();	// �θ�Ŭ������ �޼ҵ� ���
		System.out.println("�ڽ�Ŭ���� c : " + c);
	}
	
}
