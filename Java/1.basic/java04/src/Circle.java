import java.util.Scanner;

public class Circle {

	int radius;
	
	public void setCircle(int r) {	// �Էµ� ������ ���� ����
		radius = r;
	}
	
	public float area() {			// ���� ����ؼ� ��ȯ
		return radius*radius*3.14f;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Circle c = new Circle();
		int radius;	// Ŭ������ radius�ʹ� ������ ����
		
		System.out.print("������ �Է� : ");
		radius = sc.nextInt();
		
		c.setCircle(radius);	// ������ ����, Ŭ������ radius�ʹ� ������ ����
		System.out.println("�� ���� : " + c.area());
		
		sc.close();
	}

}
