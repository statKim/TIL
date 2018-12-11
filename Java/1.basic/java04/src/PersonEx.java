
public class PersonEx {

	public static void main(String[] args) {
		
		Person[] p = new Person[3];	// 3개짜리 배열 생성
		
		System.out.println("****개인 정보 입력****");
		for (int i=0; i<p.length; i++) { // p.length = 3
			p[i] = new Person();	// 객체 생성
			p[i].input();
		}
		
		System.out.println("\n****개인 정보 출력****");
		for (int i=0; i<p.length; i++) {
			p[i].output();
		}
	}

}
