
public class SingletonEx {

	public static void main(String[] args) {

		/*
		// 컴파일 에러
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();
		 */
		
		// 하나의 객체만 존재하기 때문에 두 개의 객체는 같다
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1==obj2) {
			System.out.println("같은 Singleton 객체 입니다");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		
	}

}
