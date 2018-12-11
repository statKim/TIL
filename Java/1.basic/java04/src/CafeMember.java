import java.util.Scanner;

public class CafeMember {
	
	Scanner sc = new Scanner(System.in);
	
	String cafeName;
	int memTotal, memIn, memOut;
	//	 (회원수)  (가입자 수) (탈퇴자 수)
	
	//생성자
	CafeMember(String cafeName, int memTotal) {
		this.cafeName = cafeName;
		this.memTotal = memTotal;
	}
	
	public void showCafeInfo() {
		System.out.println("***카페 정보 출력***");
		System.out.println("카페명 : " + cafeName);
		System.out.println("회원 수 : " + memTotal);
	}
	
	public void join() {
		
		System.out.println("***************");
		System.out.print("신규 회원 수 입력 : ");
		memIn = sc.nextInt();
		memTotal = memTotal + memIn;
		//sc.close();
	}
	
	public void leave() {
		//Scanner sc2 = new Scanner(System.in);
		System.out.println("***************");
		System.out.print("탈퇴 회원 수 입력 : ");
		memOut = sc.nextInt();
		memTotal = memTotal - memOut;
		sc.close();
	}
	
	public void showMemTotal() {
		System.out.println("회원 수 : " + memTotal);
	}

}
