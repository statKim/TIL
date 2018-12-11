import java.util.Scanner;

public class MusicalTicket {
	
	String name, title, membership;
	int price, seats;
	
	public MusicalTicket(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void	showMusicalInfo() {
		System.out.println("*******뮤지컬 정보 출력*******");
		System.out.println("제목 : " + title);
		System.out.println("금액 (R석) : " + price + "원");
		System.out.println("멤버십 할인율");
		System.out.println(" - SK 10%/LGU+ 8%/Olleh 6%\n");
	}
	
	public void inputReservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****뮤지컬 예약 정보 입력*****");
		System.out.print("예약자 : ");
		name = sc.next();
		System.out.print("예매 수 입력 : ");
		seats = sc.nextInt();
		System.out.print("멤버십 입력 : ");
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
		
		System.out.println("****뮤지컬 예약 정보 출력*****");
		System.out.println("예약자 : " + name);
		System.out.println("금액 (R석) : " + price + "원");
		System.out.println("예매 수 : " + seats + "매");
		System.out.println("예약금액 : " + amount + "원");
		System.out.println("할인액 : " + discount + "원");
		System.out.println("총지불액 : " + total + "원");
		System.out.println("멤버십 : " + membership);
		
	}
}
