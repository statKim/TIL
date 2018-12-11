
public class KHSarray2 {

	public static void main(String[] args) {

		int[] b = new int[5];	// 선언과 동시에 메모리 할당 => 모든 원소값은 0(초기값)
		//int b[] = new int[5]
		String[] flowers = {"해바라기", "장미", "진달래"};	// 초기화 리스트(바로 값 저장)
		
		// for문으로 b 원소에 값 저장
		for (int i=0; i<b.length; i++) {
			b[i] = i;
		}
		
		// for문으로 b 출력
		for (int i=0; i<b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
		// for문으로 flowers 출력
		for (int i=0; i<flowers.length; i++) {
			System.out.println("flowers[" + i + "] = " + flowers[i]);
		}
		
		System.out.println("b의 크기 : " + b.length);
		System.out.println("flowers의 크기 : " + flowers.length);
	}

}
