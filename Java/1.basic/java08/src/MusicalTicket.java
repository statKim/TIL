import java.util.Scanner;

public class MusicalTicket {
	
	String name, title, membership;
	int price, seats;
	
	public MusicalTicket(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void	showMusicalInfo() {
		System.out.println("*******������ ���� ���*******");
		System.out.println("���� : " + title);
		System.out.println("�ݾ� (R��) : " + price + "��");
		System.out.println("����� ������");
		System.out.println(" - SK 10%/LGU+ 8%/Olleh 6%\n");
	}
	
	public void inputReservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****������ ���� ���� �Է�*****");
		System.out.print("������ : ");
		name = sc.next();
		System.out.print("���� �� �Է� : ");
		seats = sc.nextInt();
		System.out.print("����� �Է� : ");
		membership = sc.next();		
		System.out.println();
		sc.close();
	}
	
	public int getAmount() {
		int amount = price * seats;
		return amount;
	}
	
	public int getDiscount() {
		int discount = 0; 
		int amount = getAmount();
		switch (membership) {
			case "SK" :
				discount = (int)(amount * 0.1);
				break;
			case "LGU+" :
				discount = (int)(amount * 0.08);
				break;
			case "Olleh" :
				discount = (int)(amount * 0.06);
				break;
		}
		return discount;
	}
	
	public void showRsvInfo() {
		int amount = getAmount();
		int discount = getDiscount();
		int total = amount - discount;
		
		System.out.println("****������ ���� ���� ���*****");
		System.out.println("������ : " + name);
		System.out.println("�ݾ� (R��) : " + price + "��");
		System.out.println("���� �� : " + seats + "��");
		System.out.println("����ݾ� : " + amount + "��");
		System.out.println("���ξ� : " + discount + "��");
		System.out.println("�����Ҿ� : " + total + "��");
		System.out.println("����� : " + membership);
		
	}
}
