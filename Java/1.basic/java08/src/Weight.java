import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float[] w2 = new float[5];
		float[] w4 = new float[5];
		float[] w6 = new float[5];
		float[] w8 = new float[5];
		float[] avg = new float[5];
		int i=0;
		String[] name = new String[5];
		String command;
		
		System.out.println("****���� ������ �Է�****");
		
		do {
			i = i + 1;
			System.out.print("\n���� " + i + " �Է� : ");
			name[i-1] = sc.next();
			System.out.print("2�� ������ �Է�(Kg) : ");
			w2[i-1]= sc.nextFloat();
			System.out.print("4�� ������ �Է�(Kg) : ");
			w4[i-1] = sc.nextFloat();
			System.out.print("6�� ������ �Է�(Kg) : ");
			w6[i-1] = sc.nextFloat();
			System.out.print("8�� ������ �Է�(Kg) : ");
			w8[i-1] = sc.nextFloat();
			
			avg[i-1] = (w2[i-1] + w4[i-1] + w6[i-1] + w8[i-1]) / 4f;
			
			System.out.print("\n��� �Է��Ͻðڽ��ϱ�? (y�Է��ϸ� ���) : ");
			command = sc.next();
		} while(command.equals("y"));
		
		System.out.println("\n****���� ������ ���****");
		System.out.println("����\t2��\t4��\t6��\t8��\t���\t�ְ�");
		
		float max = 0;
		for (int j=0; j<i; j++) {
			float[] num = new float[] {w2[j],w4[j],w6[j],w8[j]};
			for (int k=j; k<num.length-1; k++) {
				if (num[k] < num[k+1]) {
					max = num[k+1];
				}
			}
			System.out.println(name[j] + "\t" + w2[j] + "\t" + w4[j] + "\t"
								+ w6[j] + "\t" + w8[j] + "\t" + avg[j] + "\t" + max);
		}

		sc.close();
	}

}
