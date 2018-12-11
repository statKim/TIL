package API;

public class Replace {
	// replace() : 해당되는 문자열 바꿔줌
	public static void main(String[] args) {
		
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
	}

}
