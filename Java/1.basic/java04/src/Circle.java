import java.util.Scanner;

public class Circle {

	int radius;
	
	public void setCircle(int r) {	// 입력된 반지름 전달 받음
		radius = r;
	}
	
	public float area() {			// 면적 계산해서 반환
		return radius*radius*3.14f;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Circle c = new Circle();
		int radius;	// 클래스의 radius와는 별개의 변수
		
		System.out.print("반지름 입력 : ");
		radius = sc.nextInt();
		
		c.setCircle(radius);	// 반지름 전달, 클래스의 radius와는 별개의 변수
		System.out.println("원 면적 : " + c.area());
		
		sc.close();
	}

}
