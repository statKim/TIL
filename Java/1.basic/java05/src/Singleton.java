
public class Singleton {
	
		// 클래스 자신의 타입으로 static 필드 선언
		private static Singleton singleton = new Singleton();
		
		private Singleton() {}	// 외부에서 new 연산자로 생성자를 호출할 수 없도록 private
		
		static Singleton getInstance() {	// 외부에서 호출할 수 없는 static 메소드 사용
			return singleton;
		}
	
}
