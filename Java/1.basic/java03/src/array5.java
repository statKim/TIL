
public class KHSarray5 {

	public static void main(String[] args) {

		int[] scores;
		scores = new int[] {83, 90, 87};
		
		// for문으로 합 계산
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 = sum1 + scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		// add() 메소드로 계산(사용자 정의 함수)
		//int sum2 = add(new int[] {83,90,87});
		int sum2 = add(scores);
		System.out.println("총합 : " + sum2);
		System.out.println();

	}
	
	// 총합 계산해서 return하는 메소드(함수) => 실행되서 결과가 나오는 것이 아님!!(위에서 add함수로 사용됨)
	public static int add(int[] scores) { // scores는 단지 배열(변수) 이름!!
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum = sum + scores[i];
		}
		return sum;
	}

}
