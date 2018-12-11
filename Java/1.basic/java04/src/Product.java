import java.util.Scanner;

public class Product {
	
	static Scanner sc = new Scanner(System.in);
	
	String prdName;
	int prdPrice, prdSold, prdStock;
	
	public void inputPrdInfo() {
		System.out.println("\n****상품 정보 입력****");
		System.out.print("상품명 : ");
		prdName = sc.next();
		
		System.out.print("가격 : ");
		prdPrice = sc.nextInt();
		
		System.out.print("판매 수량 : ");
		prdSold = sc.nextInt();
		
		System.out.print("재고 수량 : ");
		prdStock = sc.nextInt();
	}
	
	public void showPrdInfo() {
		System.out.println("\n****상품 정보 출력****");
		System.out.println("상품명 : " + prdName);
		System.out.println("가격 : " + prdPrice);
		System.out.println("판매 수량 : " + prdSold);
		System.out.println("재고 수량 : " + prdStock);
	}
	
	public void salesAmount() {
		int sales = prdPrice * prdSold;
		System.out.println("매출액 : " + sales);
	}
	
	public void stockAmount() {
		int stock = prdPrice * prdStock;
		System.out.println("재고액 : " + stock);
	}
	
	
	// main 함수
	public static void main(String[] args) {

		Product prod = new Product();
		
		prod.inputPrdInfo();
		prod.showPrdInfo();
		prod.salesAmount();
		prod.stockAmount();

		sc.close();
	}

}
