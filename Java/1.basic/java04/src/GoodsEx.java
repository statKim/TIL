import java.util.Scanner;

public class GoodsEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int price, stock, sold;
		
		Goods[] g = new Goods[3];
		
		System.out.println("****��ǰ ���� �Է�****");
		for (int i=0; i<g.length; i++) {
			System.out.print("\n��ǰ�� : ");
			name = sc.next();
			
			System.out.print("���� : ");
			price = sc.nextInt();
			
			System.out.print("�Ǹŷ� : ");
			sold = sc.nextInt();
			
			System.out.print("��� : ");
			stock = sc.nextInt();
			
			// �����ڷ� ��ü �����ϸ鼭 ���� ����
			g[i] = new Goods(name, price, stock, sold);
		}
		
		System.out.println("\n****��ǰ ���� ���****");
		for (int i=0; i<g.length; i++) {
			g[i].showGoodsInfo();
		}
		
		sc.close();
	}

}
