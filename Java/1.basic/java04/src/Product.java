import java.util.Scanner;

public class Product {
	
	static Scanner sc = new Scanner(System.in);
	
	String prdName;
	int prdPrice, prdSold, prdStock;
	
	public void inputPrdInfo() {
		System.out.println("\n****��ǰ ���� �Է�****");
		System.out.print("��ǰ�� : ");
		prdName = sc.next();
		
		System.out.print("���� : ");
		prdPrice = sc.nextInt();
		
		System.out.print("�Ǹ� ���� : ");
		prdSold = sc.nextInt();
		
		System.out.print("��� ���� : ");
		prdStock = sc.nextInt();
	}
	
	public void showPrdInfo() {
		System.out.println("\n****��ǰ ���� ���****");
		System.out.println("��ǰ�� : " + prdName);
		System.out.println("���� : " + prdPrice);
		System.out.println("�Ǹ� ���� : " + prdSold);
		System.out.println("��� ���� : " + prdStock);
	}
	
	public void salesAmount() {
		int sales = prdPrice * prdSold;
		System.out.println("����� : " + sales);
	}
	
	public void stockAmount() {
		int stock = prdPrice * prdStock;
		System.out.println("���� : " + stock);
	}
	
	
	// main �Լ�
	public static void main(String[] args) {

		Product prod = new Product();
		
		prod.inputPrdInfo();
		prod.showPrdInfo();
		prod.salesAmount();
		prod.stockAmount();

		sc.close();
	}

}
