import java.util.Scanner;

public class KHSarrayEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 5���� ���Ҹ� �ִ� �迭 ����
		String[] name = new String[5];
		int[] grammar = new int[5];
		int[] listening = new int[5];
		int[] writing = new int[5];
		int[] total = new int[5];
		String[] score = new String[5];
		String command = "n";	// String Ŭ���� ����ϱ� ���� String���� ������
		
		System.out.println("****TOEIC ���� �Է�****");
		
		for (int i=0; i<name.length; i++) {
			System.out.print((i+1) + "�� ���� �Է� : ");
			name[i] = sc.next();
			System.out.print((i+1) + "�� ���� ���� �Է� : ");
			grammar[i] = sc.nextInt();
			System.out.print((i+1) + "�� ��� ���� �Է� : ");
			listening[i] = sc.nextInt();
			System.out.print((i+1) + "�� ���� ���� �Է� : ");
			writing[i] = sc.nextInt();
			
			total[i] = grammar[i] + listening[i] + writing[i];
			
			switch (total[i] / 200) {
				case 4 : score[i] = "1���"; break;	// 800 �̻��̸� 1���
				case 3 : score[i] = "2���"; break;	// 600~799�̸� 2���
				case 2 : score[i] = "3���"; break;	// 400~599�̸� 3���
				default : score[i] = "4���";			// ������ 4���
			}
			
			// �迭 ������ 5���� �ԷµǸ� break
			if (i==4)
				break;
				
			System.out.print("\n��� �Է��Ͻðڽ��ϱ�? (y�Է��ϸ� ���) : ");
			command = sc.next();
			if (command.equals("y")==false) {	// "y"�� �ƴ� �ٸ� Ű�� ������ break
				break;
			}
		}
		
		System.out.println("\n****TOEIC ���� ���****");
		for (int i=0; i<name.length; i++) {
			if (name[i]==null) // name�� null�̸� break �ɾ ��� ����
			//if (grammar[i] == 0)	
				break;
			System.out.println((i+1) + "�� " + name[i] + " " + total[i] + " " + score[i]);
		}
		
		sc.close();
		
	}

}
		
//		//////////////		
//		// ����!!!
		//////////////
//		Scanner sc = new Scanner(System.in);
//		
//		String[] name = new String[5];
//		int[] gram = new int[5];
//		int[] list = new int[5];
//		int[] read = new int[5];
//		int total, count=0;
//		String answer, grade;
//		
//		System.out.println("****TOEIC ���� �Է�****");
//				
//		do {
//			System.out.print((count+1) + "�� ���� �Է� : ");
//			name[count] = sc.next();
//			System.out.print((count+1) + "�� ���� ���� �Է� : ");
//			gram[count] = sc.nextInt();
//			System.out.print((count+1) + "�� ��� ���� �Է� : ");
//			list[count] = sc.nextInt();
//			System.out.print((count+1) + "�� ���� ���� �Է� : ");
//			read[count] = sc.nextInt();
//			
//			count = count + 1;
//			
//			System.out.print("\n��� �Է��Ͻðڽ��ϱ�? (y�Է��ϸ� ���) : ");
//			answer = sc.next();
//		} while(answer.equals("y") && (count<5));
//		
//		System.out.println("\n****TOEIC ���� ���****");
//		for (int i=0; i<count; i++) {
//			total = gram[i] + list[i] + read[i];
//			
//			switch (total / 200) {
//				case 4 : grade = "1���"; break;
//				case 3 : grade = "2���"; break;
//				case 2 : grade = "3���"; break;
//				default : grade = "4���";
//			}
//
//			System.out.println((i+1) + "�� " + name[i] + " " + total + " " + grade);
//		}		
//		
//		sc.close();
//		
//	}
//
//}
