
public class ShareEx {

	public static void main(String[] args) {

		Share s1, s2;
		
		s1 = new Share();
		s1.set(5);
		
		System.out.println("s1의 a : " + s1.showA());		//5
		System.out.println("staticA : " + Share.showStaticA());	//5
		
		s2 = new Share();
		s2.set(100);
		
		System.out.println("s2의 a : " + s2.showA());		//100
		System.out.println("staticA : " + Share.showStaticA());	//105
		// staticA가 전역변수의 개념이기 때문에 105가 됨

	}

}
