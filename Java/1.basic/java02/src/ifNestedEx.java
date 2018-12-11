import java.util.Scanner;
import java.text.DecimalFormat;

public class KHSifNestedEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###");	// õ�ڸ� ǥ���ϱ� ����
		
		int num, count, price, total, dis;
		String name;
		
		System.out.println("******* ��ǰ ���� *******");
		System.out.println("1 ��Ʈ�� : 1,200,000 ��");
		System.out.println("2 ������ī�޶� : 400,000 ��");
		System.out.println("*********************");
		System.out.print("��ǰ��ȣ �Է� : ");
		num = sc.nextInt();
		
		if ((num==1) || (num==2)) {
			
			if (num==1) {
				name = "��Ʈ��";
				price = 1200000;
			} else {
				name = "������ī�޶�";
				price = 400000;
			}
			
			System.out.print("�ֹ� ���� �Է� : ");
			count = sc.nextInt();
			total = price * count;
			
			if (total>=1000000) {
				dis = (int)(total*0.1);	
			} else if (total>=500000) {
				dis = (int)(total*0.05);
			} else {
				dis = 0;
			}
			
//			System.out.println("******* �ֹ� ���� *******");
//			System.out.println("��ǰ�� : " + name);
//			System.out.println("���� : " + price + " ��");
//			System.out.println("�ֹ� ���� : " + count + " ��");
//			System.out.println("�ֹ��� : " + total + " ��");
//			System.out.println("���ξ� : " + dis + " ��");
//			System.out.println("�����Ҿ� : " + (total - dis) + " ��");
			
			// õ�ڸ� ����
			System.out.println("******* �ֹ� ���� *******");
			System.out.println("��ǰ�� : " + name);
			System.out.println("���� : " +  df.format(price) + " ��");
			System.out.println("�ֹ� ���� : " + count + " ��");
			System.out.println("�ֹ��� : " + df.format(total) + " ��");
			System.out.println("���ξ� : " + df.format(dis) + " ��");
			System.out.println("�����Ҿ� : " + df.format(total - dis) + " ��");
			
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �����մϴ�.");
		}
		
		sc.close();
		
	}

}
