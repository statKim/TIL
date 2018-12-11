
public class KHSexercise04 {

	public static void main(String[] args) {

		int pencils = 534;
		int students = 30;
		
		// 한 명이 가져가는 연필 개수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);	// 인당 17개씩
		
		// 연필 남은 개수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);		// 24개 남음
		
	}

}
