package MultiThread;

public class BeepPrintEx {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask();		//Runnable ��ü ����
		Thread thread = new Thread(beepTask);	//�۾� ������ ����
		thread.start();	//BeepTask ��ü�� run() �޼ҵ� ����
		
		for (int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}	//0.5�ʰ� �Ͻ�����
		}

	}

}
