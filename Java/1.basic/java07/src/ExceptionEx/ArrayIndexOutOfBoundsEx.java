package ExceptionEx;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {	// Exception �߻��� �����޽��� �ȶ߰� �ϴ� ���!!(����ó��)
			System.out.println("[���� ���]");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.print("��1 ��2");
		}

	}

}
