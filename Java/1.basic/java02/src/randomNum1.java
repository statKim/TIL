// Math.random() : 0에서 1  사이의 난수 생성
public class KHSrandomNum1 {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {
			//double num = Math.random();			// 0과 1사이의 난수
			//double num = Math.random()*10;
			//int num = (int)(Math.random()*10);		// 0~9사이의 난수
			int num = (int)(Math.random()*10) + 1;		// 1~10사이의 난수
			System.out.println(num);
		}

	}

}
