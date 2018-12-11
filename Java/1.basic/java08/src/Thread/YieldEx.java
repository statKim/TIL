package Thread;

public class YieldEx {

	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();	//A ����
		threadB.start();	//B ����
		
		// sleep()�� ����ó���� ���� �ʰ� ���������� ��� �Ұ�!!
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = false;	//threadA�� yield�� -> B�� ����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = true;	//A �ٽ� ���� -> A,B ��� ����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.stop = true;	//A ����
		threadB.stop = true;	//B ����
	}

}
