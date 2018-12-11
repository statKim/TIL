package pack2;

import pack1.AAA;

///다른 패키지에서는 public만 접근 가능
public class CCC {

	public CCC() {
		AAA a = new AAA();
		a.field1 = 1;
		//a.field2 = 1;	//(x) default
		//a.field3 = 1;	//(x) private
		
		a.method1();
		//a.method2();	//(x) default
		//a.method3();	//(x) private
	}
	
}
