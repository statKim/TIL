
public class KHSarrayLength {

	public static void main(String[] args) {

		int[] scores = {83,90,87};
//		int[] scores;
//		scores = new int[] {83,90,87};
		
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println("���� : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("��� : " + avg);

	}

}
