
public class CourseEx {

	public static void main(String[] args) {

		Course[] co = new Course[3];	// 크기가 3인 배열 생성
		
		System.out.println("****과목 정보 입력****");
		for (int i=0; i<co.length; i++) { // co.length = 3
			co[i] = new Course();	// 객체 생성
			co[i].input();
		}
		
		System.out.println("\n****과목 정보 출력****");
		for (int i=0; i<co.length; i++) {
			co[i].output();
		}

	}

}
