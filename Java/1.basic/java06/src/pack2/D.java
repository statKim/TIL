package pack2;

import pack1.AAA;

// 다른 패키지에서는 public 접근 가능
// 상속의 경우 protected 필드 접근 가능
// 자식 클래스도 private default 필드는 접근 불가
public class D extends AAA {

	public D() {
		super();
		field1 = 1;	//public
		//field2 = 1;	//default (X)
		//field3 = 1; //private (X)
		field4 = 1;	//protected - 상속의 경우 접근 제한 없음
		
		method1();	//public
		//method2();	//default (X)
		//method3();	//private (X)
		method4();	//protected - 상속의 경우 접근 제한 없음
	}
	
}
