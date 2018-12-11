
public class Reservation {

	String plane, name, depart, land, seat;
	int price;
	
//	public Reservation() {
//		this("KE1001", "홍길동", "인천", "뉴욕", 1600000, "A38");
//	}
	
	public Reservation(String pl, String na, String dep, String lan,
					int p, String se) {
		plane = pl;
		name = na;
		depart = dep;
		land = lan;
		price = p;
		seat = se;
	}
	
	public void showRsvInfo() {
		System.out.println("**항공권 예약 정보**");
		System.out.println("항공기 : " + plane);
		System.out.println("예약자 : " + name);
		System.out.println("출발지 : " + depart);
		System.out.println("도착지 : " + land);
		System.out.println("금액 : " + price);
		System.out.println("좌석번호 : " + seat);
	 }
	

}
