package MultiThread;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// synchronized 붙여서 "memory" 변수를 공유하는 것을 방지
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}

}
