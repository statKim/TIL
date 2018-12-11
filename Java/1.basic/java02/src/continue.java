
public class KHScontinue {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {
			if (i%2 != 0) {
				continue;		// 아랫부분을 실행하지 않고 바로 반복문으로 돌아감
			}					// 즉 홀수일 때는 print하지 않음
			System.out.println(i);
		}

	}

}
