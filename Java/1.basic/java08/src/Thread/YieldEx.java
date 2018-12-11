package Thread;

public class YieldEx {

	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();	//A 실행
		threadB.start();	//B 실행
		
		// sleep()은 예외처리를 하지 않고 독립적으로 사용 불가!!
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = false;	//threadA가 yield함 -> B만 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = true;	//A 다시 실행 -> A,B 모두 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.stop = true;	//A 종료
		threadB.stop = true;	//B 종료
	}

}
