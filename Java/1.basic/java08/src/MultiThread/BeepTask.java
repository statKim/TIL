package MultiThread;

import java.awt.Toolkit;

//비프음을 들려주는 작업 정의(재정의해줌)
public class BeepTask implements Runnable {
	
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit 객체 생성
		for (int i=0; i<5; i++) {
			toolkit.beep(); //비프음 발생
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}

}
