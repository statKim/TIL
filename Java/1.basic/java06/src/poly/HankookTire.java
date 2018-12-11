package poly;

public class HankookTire extends Tire {

	//�ʵ�
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		accumulatedRotation = accumulatedRotation + 1;	//���� ȸ���� 1 ����
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ���� : " +
					(maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
	
	
}
