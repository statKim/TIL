
public class Reservation {

	String plane, name, depart, land, seat;
	int price;
	
//	public Reservation() {
//		this("KE1001", "ȫ�浿", "��õ", "����", 1600000, "A38");
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
		System.out.println("**�װ��� ���� ����**");
		System.out.println("�װ��� : " + plane);
		System.out.println("������ : " + name);
		System.out.println("����� : " + depart);
		System.out.println("������ : " + land);
		System.out.println("�ݾ� : " + price);
		System.out.println("�¼���ȣ : " + seat);
	 }
	

}
