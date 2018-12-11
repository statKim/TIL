package MultiThread;

import java.awt.Toolkit;

public class SleepEx {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<10; i++) {
			toolkit.beep();
			System.out.println("beep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}

	}

}
