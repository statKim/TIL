package API;

public class IndexOf {
	// indexOf() : 문자열의 인덱스를 반환해주는 메소드(처음 만나는 글자만 찾음)
	//				주어진 문자열 없을 시 -1 반환
	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");	// 첫번째 글자인 "프"의 인덱스 반환
		System.out.println(location);
		
		if (subject.indexOf("자바") != -1) {			// 주어진 문자열이 없으면
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
	}
	
}
