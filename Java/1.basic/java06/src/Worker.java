
public class Worker {

	String joominNo, name;
	
	public Worker(String joominNo, String name) {
		this.joominNo = joominNo;
		this.name = name;
	}
	
	public void showWorkerInfo() {
		System.out.println("**아르바이트생 급여 지급 내역**");
		System.out.println("주민번호 : " + joominNo);
		System.out.println("성명 : " + name);
	}
	
}
