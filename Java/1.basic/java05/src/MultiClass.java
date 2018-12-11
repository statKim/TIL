import java.util.Scanner;

// ���� �� Ŭ������ �־���� �ϴ� ���
	class Add {
		private int a, b;
		public Add(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public void calculate() {
			System.out.println("���ϱ� : " + (a+b));
		}
	}
	
	class Subtract {
		private int a, b;
		public Subtract(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public void calculate() {
			System.out.println("���� : " + (a-b));
		}
	}
	
	class Multiply {
		private int a, b;
		public Multiply(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public void calculate() {
			System.out.println("���ϱ� : " + (a*b));
		}
	}
	
	class Divide {
		private int a, b;
		public Divide(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public void calculate() {
			System.out.println("������ : " + (a/b));
		}
	}
	
	
public class MultiClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;
		
		System.out.print("����1 �Է� : ");
		a = sc.nextInt();
		System.out.print("����2 �Է� : ");
		b = sc.nextInt();
		
		System.out.print("������ �Է� (+,-,*,/) : ");
		operator = sc.next().charAt(0);	// �����ڸ� ���ڷ� ��ȯ(ù��° ���ڸ� ����)
		
		switch (operator) {
			case '+' :
				Add add = new Add(a,b);
				add.calculate();
				break;
			case '-' :
				Subtract sub = new Subtract(a,b);
				sub.calculate();
				break;
			case '*' :
				Multiply mul = new Multiply(a,b);
				mul.calculate();
				break;
			case '/' :
				Divide div = new Divide(a,b);
				div.calculate();
				break;
			default :
				System.out.println("�߸��� �������Դϴ�.");
		}
		sc.close();
	}
	
}
