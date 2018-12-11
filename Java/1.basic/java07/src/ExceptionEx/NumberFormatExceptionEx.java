package ExceptionEx;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "a100";	//숫자로 변환 불가능
		
		int value1 = Integer.parseInt(data1);	//data1을 int로 바꿔줌
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);

	}

}
