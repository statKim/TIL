import java.util.Scanner;

public class Rectangle {

	static Scanner sc = new Scanner(System.in);	// static은 전역변수처럼 쓰기 위해
	int width, height;
	
	public void input() {
		System.out.print("가로 길이 입력 : ");
		width = sc.nextInt();
		
		System.out.print("세로 길이 입력 : ");
		height = sc.nextInt();
	}
	
	public void area() {
		System.out.println("사각형 면적 : " + width*height);
	}
	
	
	// main 함수
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		rec.input();
		rec.area();
		sc.close();
	}

}
