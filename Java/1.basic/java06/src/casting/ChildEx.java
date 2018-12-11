package casting;

public class ChildEx {

	public static void main(String[] args) {

		Parent parent = new Child();	//자동 타입 변환
		parent.field1 = "data1";
		parent.method1();	// 실행시 오버로딩 됐는지 확인
		parent.method2();	// 안돼있으면 Parent 메소드 실행
		
		/* 부모(Parent)클래스 형태이기 때문에 자식클래스에만 있는 필드, 메소드 사용 불가
		parent.field2 = "data2";		//(불가능)
		parent.method3();				//(불가능)
		*/
		
		Child child = (Child) parent;	//강제 타입 변환
		child.field2 = "yyy";			//(가능) - Child 클래스 객체
		child.method3();				//(가능)
		

	}

}
