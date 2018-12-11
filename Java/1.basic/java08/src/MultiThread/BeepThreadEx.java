package MultiThread;

public class BeepThreadEx {

	public static void main(String[] args) {

		//Runnable beepThread = new BeepThread();
		Thread thread = new BeepThread(); // Thread 클래스에서 상속받았기 때문에
		
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		
	}

}
