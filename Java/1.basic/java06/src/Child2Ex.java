
public class Child2Ex {

	public static void main(String[] args) {

		Child2 ch = new Child2();	//�ڵ� Ÿ�� ��ȯ
		
		Parent2 pa = ch;
		pa.method1();
		pa.method2();			// �����ǵ� Child2�� �޼ҵ� ȣ��(Override�Ʊ� ����)
		//pa.method3();			// ȣ�� �Ұ���(�θ�Ŭ������ ����� �ʵ�� �޼ҵ常
								// 			ȣ�� ����!!!)
	}

}
