package pack1;

public class AAA {

	public int field1;	// public 접근 제한
	int field2;			// default
	private int field3;	// private
	protected int field4;	// protected
	
	public AAA() {
		field1 = 1;	// (o)
		field2 = 1;	// (o)
		field3 = 1;	// (o)
		
		method1();	// (o)
		method2();	// (o)
		method3();	// (o)
	}
	
	public void method1() {}	//public
	void method2() {}			//default
	private void method3() {}	//private
	protected void method4() {}	//protected
}
