
public class Share {

		int a;				//인스턴스 필드
		static int staticA;	// static 필드
		
		// 멤버필드는 자동으로 0으로 초기화됨!!(default값 a=0)
		public void set(int n) {	// 인스턴스 메소드
			a = a + n;				// 여기서는 인스턴스, static 필드 모두 사용 가능
			staticA = staticA + n;
		}
		
		public int showA() {		// 인스턴스 메소드
			return a;
		}
		
		public static int showStaticA() {	// static 메소드
			return staticA;					// static 필드만 사용 가능
		}
		
}
