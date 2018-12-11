import java.util.Scanner;

public class Person {

	Scanner sc = new Scanner(System.in);
	
	String name;
	int age, height, weight;
	
	public void input() {
		System.out.print("\n성명 입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		System.out.print("키 입력 (cm) : ");
		height = sc.nextInt();
		
		System.out.print("몸무게 입력 (Kg) : ");
		weight = sc.nextInt();
	}
	
	public void output() {
		System.out.print(name + " ");
		System.out.print(age + "살 ");
		System.out.print(height + "cm ");
		System.out.print(weight + "Kg\n");
	}
}	
