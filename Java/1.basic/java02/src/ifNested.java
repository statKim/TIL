import java.util.Scanner;

public class KHSifNested {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num, pay;
		
		System.out.print("��ȣ �Է� (1.���� 2.ī��) : ");
		num = sc.nextInt();

		if ((num==1) || (num==2)) {
			System.out.print("���Ҿ� �Է� : ");
			pay = sc.nextInt();
			
			if (num==1) {
				System.out.println("������ : 10 %");
				System.out.println("���ξ� : " + (int)(pay*0.1) + " ��");
				//System.out.println("���ξ� : " + pay/10 + " ��");
			} else {
				System.out.println("������ : 5%");
				System.out.println("���ξ� : " + (int)(pay*0.05) + " ��");
				//System.out.println("���ξ� : " + pay/20 + " ��");
			}
				
		} else
			System.out.println("�߸� �Է��Ͽ����ϴ�. �����մϴ�.");
		
		sc.close();
		
	}

}
