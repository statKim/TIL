package pack1;

// ���� ��Ű�� �������� private �ʵ�� �޼ҵ带 ������
// �ٸ� �ʵ�� �޼ҵ� ���� ����
public class BBB {

	public BBB() {
		AAA a = new AAA();
		a.field1 = 1;	// (o) public
		a.field2 = 1;	// (o) default
		//.field3 = 1;	// (x) private
		a.field4 = 1;	// (o) protected - ���� ��Ű�� �� ���� ���� ����
		
		a.method1();	// (o) public
		a.method2();	// (o) default
		//a.method3();	// (x) private
		a.method4();	// (o) protected - ���� ��Ű�� �� ���� ���� ����	
	}
	
}
