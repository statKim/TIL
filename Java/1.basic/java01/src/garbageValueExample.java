// byte와 int의 범위 차이!!!
// byte에서는 최대값인 127을 넘어가면 최소값인 -128부터 다시 시작함(범위 : -128~127)
public class KHSgarbageValueExample {

	public static void main(String[] args) {
		
		byte var1 =  125;
		int var2 = 125;
		
		for (int i=0; i<5; i++) {	// 초기값 i=0, i에 1씩 더하면서 5보다 작을 때까지 반복
			var1++;	// var1에 1 더함
			var2++;	// var2에 1 더함
			System.out.println("var1: " + var1 + "\t" + "var2 : " + var2);;
			
		}
		
	}

}
