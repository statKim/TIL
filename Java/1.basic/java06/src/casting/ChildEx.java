package casting;

public class ChildEx {

	public static void main(String[] args) {

		Parent parent = new Child();	//�ڵ� Ÿ�� ��ȯ
		parent.field1 = "data1";
		parent.method1();	// ����� �����ε� �ƴ��� Ȯ��
		parent.method2();	// �ȵ������� Parent �޼ҵ� ����
		
		/* �θ�(Parent)Ŭ���� �����̱� ������ �ڽ�Ŭ�������� �ִ� �ʵ�, �޼ҵ� ��� �Ұ�
		parent.field2 = "data2";		//(�Ұ���)
		parent.method3();				//(�Ұ���)
		*/
		
		Child child = (Child) parent;	//���� Ÿ�� ��ȯ
		child.field2 = "yyy";			//(����) - Child Ŭ���� ��ü
		child.method3();				//(����)
		

	}

}
