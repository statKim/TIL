
public class KHScontinue {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {
			if (i%2 != 0) {
				continue;		// �Ʒ��κ��� �������� �ʰ� �ٷ� �ݺ������� ���ư�
			}					// �� Ȧ���� ���� print���� ����
			System.out.println(i);
		}

	}

}