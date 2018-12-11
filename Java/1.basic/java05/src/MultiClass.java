import java.util.Scanner;

// 여러 개 클래스를 넣어놓고 하는 방법
	class Add {
		private int a, b;
		public Add(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public void calculate() {
			System.out.println("더하기 : " + (a+b));
		}
	}
	
	class Subtract {
		private int a, b;
		public Subtract(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public void calculate() {
			System.out.println("빼기 : " + (a-b));
		}
	}
	
	class Multiply {
		private int a, b;
		public Multiply(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public void calculate() {
			System.out.println("곱하기 : " + (a*b));
		}
	}
	
	class Divide {
		private int a, b;
		public Divide(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public void calculate() {
			System.out.println("나누기 : " + (a/b));
		}
	}
	
	
public class MultiClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;
		
		System.out.print("정수1 입력 : ");
		a = sc.nextInt();
		System.out.print("정수2 입력 : ");
		b = sc.nextInt();
		
		System.out.print("연산자 입력 (+,-,*,/) : ");
		operator = sc.next().charAt(0);	// 연산자를 문자로 변환(첫번째 문자를 저장)
		
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
				System.out.println("잘못된 연산자입니다.");
		}
		sc.close();
	}
	
}
