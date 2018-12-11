package API;

public class ToLowerupperCase {
	// toLowerCase() : 소문자로 변경(반대는 Upper)
	// equalsIgnoreCase() : 대소문자 무시하고 비교
	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase(); //java programming
		String lowerStr2 = str2.toLowerCase(); //java programming
		System.out.println(lowerStr1.equals(lowerStr2));
		// equalsIgnoreCase() : 대소문자 무시하고 비교!!
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
