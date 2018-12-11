package pack1;

// 동일 패키지 내에서는 private 필드와 메소드를 제외한
// 다른 필드와 메소드 접근 가능
public class BBB {

	public BBB() {
		AAA a = new AAA();
		a.field1 = 1;	// (o) public
		a.field2 = 1;	// (o) default
		//.field3 = 1;	// (x) private
		a.field4 = 1;	// (o) protected - 동일 패키지 내 접근 제한 없음
		
		a.method1();	// (o) public
		a.method2();	// (o) default
		//a.method3();	// (x) private
		a.method4();	// (o) protected - 동일 패키지 내 접근 제한 없음	
	}
	
}
