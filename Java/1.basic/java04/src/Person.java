import java.util.Scanner;

public class Person {

	Scanner sc = new Scanner(System.in);
	
	String name;
	int age, height, weight;
	
	public void input() {
		System.out.print("\n���� �Է� : ");
		name = sc.next();
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		System.out.print("Ű �Է� (cm) : ");
		height = sc.nextInt();
		
		System.out.print("������ �Է� (Kg) : ");
		weight = sc.nextInt();
	}
	
	public void output() {
		System.out.print(name + " ");
		System.out.print(age + "�� ");
		System.out.print(height + "cm ");
		System.out.print(weight + "Kg\n");
	}
}	
