package ExceptionEx;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {	// Exception 발생시 오류메시지 안뜨게 하는 방법!!(예외처리)
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.print("값1 값2");
		}

	}

}
