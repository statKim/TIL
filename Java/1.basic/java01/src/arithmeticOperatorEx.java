import java.util.Scanner;
import java.text.DecimalFormat;

public class KHSarithmeticOperatorEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, total;
		float average;	// ��� �Ǽ��� ����
		
		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		math = sc.nextInt();
		
		System.out.println("====================");
		
		total = kor + eng + math;	// ����
		System.out.println("���� : " + total);
		
		average = total / 3.0f;		//float������ ����ؾ��ϱ� ������ ������ ���� float�������� ����
									//�Ǵ� total�� float�� �����ϰ� 3���� ������ ���� ����� ����
		// �Ҽ��� ���� 2�ڸ��� ����
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("��� : " + df.format(average));
		
		sc.close();
		
	}

}
