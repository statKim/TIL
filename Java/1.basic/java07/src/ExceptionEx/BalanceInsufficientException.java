package ExceptionEx;

//����� ���� ���� Ŭ���� ����
//������ 2��
//Exception ��Ű���� ��ӹ޾Ƽ� ��� ����ó�� ��ɵ��� ������!!!
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() { } //�⺻ ������
	
	//���� �߻� ����(���� �޽���)�� �����ϱ� ���� String Ÿ�� �Ű������� ���� ������
	//���� Ŭ������ �����ڸ� ȣ���Ͽ� ���� �޽��� ����
	//���� �޽��� �뵵�� catch{ } ����� ���� ó�� �ڵ忡�� �̿�
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
