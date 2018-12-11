
public class PartTime extends Worker {

	int hours, unitPrice;
	
	public PartTime(String joominNo, String name, 
					int hours, int unitPrice) {
		super(joominNo, name);
		this.hours = hours;
		this.unitPrice = unitPrice;
	}
	
	public int calculatePay() {
		int money = hours * unitPrice;
		return money;
	}
	
	public void showPay() {
		showWorkerInfo();
		System.out.println("시급 : " + unitPrice + " 원");
		System.out.println("근무시간 : " + hours + " 시간");
		System.out.println("총지불액 : " + calculatePay() + " 원");
	}
	
}
