import java.util.Scanner;
public class KHSarrayEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int temp;	// ���� �ٲ� �� �ӽ÷� ����ϴ� ����
		
		System.out.println("���� �Է�");

		for (int i=0; i<num.length; i++) {
			System.out.print("num[" + i + "] �Է� : ");
			num[i] = sc.nextInt();
		}
		
		System.out.print("\n���� �� : \t");
		for (int i=0; i<num.length; i++) {
			System.out.print("\t" + num[i]);
		}
		
		System.out.print("\n�������� ���� : ");
		for (int i=0; i<num.length-1; i++) {	// �ڱ��ڽŰ� ���� �ʿ�X => ��ü����-1
			for (int j=i+1; j<num.length; j++) {
				if (num[i]>num[j]) {
					temp = num[i];		// ���� �ٲٱ� ���� �ӽ÷� �������� ����
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.print("\t" + num[i]);
		}
		
		System.out.print("\n�������� ���� : ");
		for (int i=0; i<num.length-1; i++) {
			for (int j=i+1; j<num.length; j++) {
				if (num[i]<num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.print("\t" + num[i]);
		}
		sc.close();
	}

}
