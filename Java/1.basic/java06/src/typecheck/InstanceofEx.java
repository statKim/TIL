package typecheck;

public class InstanceofEx {
	
	// ���� Parent���� Ȯ���ؼ� ��ȯ�ϴ� �޼ҵ�
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1-Child�� ��ȯ ����");
		} else {
			System.out.println("method1-Child�� ��ȯ���� ����");
		}
	}
	
	// ������ ��ȯ�ϴ� �޼ҵ� => ��ȯ�� ������ �� ����!!!
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2-Child�� ��ȯ ����");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();	//Child ��ü(�ν��Ͻ�) ����
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();	//Parent ��ü(�ν��Ͻ�) ����
		method1(parentB);
		//method2(parentB);	// ������!!
	}

}
