import java.util.Scanner;

public class CafeMember {
	
	Scanner sc = new Scanner(System.in);
	
	String cafeName;
	int memTotal, memIn, memOut;
	//	 (ȸ����)  (������ ��) (Ż���� ��)
	
	//������
	CafeMember(String cafeName, int memTotal) {
		this.cafeName = cafeName;
		this.memTotal = memTotal;
	}
	
	public void showCafeInfo() {
		System.out.println("***ī�� ���� ���***");
		System.out.println("ī��� : " + cafeName);
		System.out.println("ȸ�� �� : " + memTotal);
	}
	
	public void join() {
		
		System.out.println("***************");
		System.out.print("�ű� ȸ�� �� �Է� : ");
		memIn = sc.nextInt();
		memTotal = memTotal + memIn;
		//sc.close();
	}
	
	public void leave() {
		//Scanner sc2 = new Scanner(System.in);
		System.out.println("***************");
		System.out.print("Ż�� ȸ�� �� �Է� : ");
		memOut = sc.nextInt();
		memTotal = memTotal - memOut;
		sc.close();
	}
	
	public void showMemTotal() {
		System.out.println("ȸ�� �� : " + memTotal);
	}

}
