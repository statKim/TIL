package pack2;

import pack1.AAA;

// �ٸ� ��Ű�������� public ���� ����
// ����� ��� protected �ʵ� ���� ����
// �ڽ� Ŭ������ private default �ʵ�� ���� �Ұ�
public class D extends AAA {

	public D() {
		super();
		field1 = 1;	//public
		//field2 = 1;	//default (X)
		//field3 = 1; //private (X)
		field4 = 1;	//protected - ����� ��� ���� ���� ����
		
		method1();	//public
		//method2();	//default (X)
		//method3();	//private (X)
		method4();	//protected - ����� ��� ���� ���� ����
	}
	
}
