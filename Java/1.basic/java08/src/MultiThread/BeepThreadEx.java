package MultiThread;

public class BeepThreadEx {

	public static void main(String[] args) {

		//Runnable beepThread = new BeepThread();
		Thread thread = new BeepThread(); // Thread Ŭ�������� ��ӹ޾ұ� ������
		
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		
	}

}
