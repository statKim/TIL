package ExceptionEx;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "a100";	//���ڷ� ��ȯ �Ұ���
		
		int value1 = Integer.parseInt(data1);	//data1�� int�� �ٲ���
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);

	}

}
