class Parent {
	private int x = 10;
	
	public void show() {
		System.out.println("Parent Ŭ���� x : " + x);
	}
}

class Child extends Parent {
	private int x = 20;
	
	//@Override // ���� �����ϳ� ���°��� ����
	public void show() {
		System.out.println("Child Ŭ���� x : " + x);
	}
}

public class Overriding {
	
	public static void main (String[] args) {
		Parent p = new Parent();
		p.show();	// �θ�Ŭ������ �޼ҵ�
		
		Child c = new Child();	// �ڵ� �������̵�(@Override ���ص� �̸� ���Ƽ� ��)
		c.show();	// �ڽ�Ŭ������ �޼ҵ�
		
		Parent obP = new Child();
		obP.show();	// �ڵ� �������̵� => �ڽ�Ŭ������ �޼ҵ�
	}
	
}
