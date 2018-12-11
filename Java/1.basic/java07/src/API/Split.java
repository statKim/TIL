package API;

public class Split {

	public static void main(String[] args) {

		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		
		for (String name:names) {		//names배열에서 하나씩 name변수로 해서
			System.out.println(name);
		}

	}

}
