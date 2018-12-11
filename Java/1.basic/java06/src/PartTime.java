
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
		System.out.println("�ñ� : " + unitPrice + " ��");
		System.out.println("�ٹ��ð� : " + hours + " �ð�");
		System.out.println("�����Ҿ� : " + calculatePay() + " ��");
	}
	
}
