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
		
		System.out.println("****월별 몸무게 입력****");
		
		do {
			i = i + 1;
			System.out.print("\n성명 " + i + " 입력 : ");
			name[i-1] = sc.next();
			System.out.print("2월 몸무게 입력(Kg) : ");
			w2[i-1]= sc.nextFloat();
			System.out.print("4월 몸무게 입력(Kg) : ");
			w4[i-1] = sc.nextFloat();
			System.out.print("6월 몸무게 입력(Kg) : ");
			w6[i-1] = sc.nextFloat();
			System.out.print("8월 몸무게 입력(Kg) : ");
			w8[i-1] = sc.nextFloat();
			
			avg[i-1] = (w2[i-1] + w4[i-1] + w6[i-1] + w8[i-1]) / 4f;
			
			System.out.print("\n계속 입력하시겠습니까? (y입력하면 계속) : ");
			command = sc.next();
		} while(command.equals("y"));
		
		System.out.println("\n****월별 몸무게 출력****");
		System.out.println("성명\t2월\t4월\t6월\t8월\t평균\t최고");
		
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
