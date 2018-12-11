// 증감연산자!!
public class KHSincreaseOperator {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("=============================");
		x++;
		++x;
		System.out.println("x = " + x);	//x=12
		
		System.out.println("=============================");
		y--;
		--y;
		System.out.println("y = " + y);	//y=8
		
		System.out.println("=============================");
		z = x++;
		System.out.println("z = " + z);	//z=12
		System.out.println("X = " + x);	//x=13
		
		System.out.println("=============================");
		z = ++x;
		System.out.println("z = " + z);	//z=14
		System.out.println("x = " + x);	//x=14
		
		System.out.println("=============================");
		z = ++x + y++;					// 15 + 8
		System.out.println("Z = " + z);	//z=23
		System.out.println("x = " + x);	//x=15
		System.out.println("y = " + y);	//y=9
		

	}

}
