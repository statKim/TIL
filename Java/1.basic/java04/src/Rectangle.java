import java.util.Scanner;

public class Rectangle {

	static Scanner sc = new Scanner(System.in);	// static�� ��������ó�� ���� ����
	int width, height;
	
	public void input() {
		System.out.print("���� ���� �Է� : ");
		width = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		height = sc.nextInt();
	}
	
	public void area() {
		System.out.println("�簢�� ���� : " + width*height);
	}
	
	
	// main �Լ�
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		rec.input();
		rec.area();
		sc.close();
	}

}
