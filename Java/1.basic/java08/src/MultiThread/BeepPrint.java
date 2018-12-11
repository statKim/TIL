package MultiThread;

import java.awt.Toolkit;

public class BeepPrint {
	
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//비프음 5번 연속 출력
		for (int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		
		//땡 다섯번 연속 출력
		for (int i=0; i<5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}

}
