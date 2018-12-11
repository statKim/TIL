import java.util.Scanner;

public class GoodsEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int price, stock, sold;
		
		Goods[] g = new Goods[3];
		
		System.out.println("****상품 정보 입력****");
		for (int i=0; i<g.length; i++) {
			System.out.print("\n상품명 : ");
			name = sc.next();
			
			System.out.print("가격 : ");
			price = sc.nextInt();
			
			System.out.print("판매량 : ");
			sold = sc.nextInt();
			
			System.out.print("재고량 : ");
			stock = sc.nextInt();
			
			// 생성자로 객체 생성하면서 인자 전달
			g[i] = new Goods(name, price, stock, sold);
		}
		
		System.out.println("\n****상품 정보 출력****");
		for (int i=0; i<g.length; i++) {
			g[i].showGoodsInfo();
		}
		
		sc.close();
	}

}
