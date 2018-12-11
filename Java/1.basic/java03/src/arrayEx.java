import java.util.Scanner;

public class KHSarrayEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 5개의 원소를 넣는 배열 생성
		String[] name = new String[5];
		int[] grammar = new int[5];
		int[] listening = new int[5];
		int[] writing = new int[5];
		int[] total = new int[5];
		String[] score = new String[5];
		String command = "n";	// String 클래스 사용하기 위해 String으로 지정함
		
		System.out.println("****TOEIC 점수 입력****");
		
		for (int i=0; i<name.length; i++) {
			System.out.print((i+1) + "번 성명 입력 : ");
			name[i] = sc.next();
			System.out.print((i+1) + "번 문법 점수 입력 : ");
			grammar[i] = sc.nextInt();
			System.out.print((i+1) + "번 듣기 점수 입력 : ");
			listening[i] = sc.nextInt();
			System.out.print((i+1) + "번 독해 점수 입력 : ");
			writing[i] = sc.nextInt();
			
			total[i] = grammar[i] + listening[i] + writing[i];
			
			switch (total[i] / 200) {
				case 4 : score[i] = "1등급"; break;	// 800 이상이면 1등급
				case 3 : score[i] = "2등급"; break;	// 600~799이면 2등급
				case 2 : score[i] = "3등급"; break;	// 400~599이면 3등급
				default : score[i] = "4등급";			// 나머지 4등급
			}
			
			// 배열 길이인 5명이 입력되면 break
			if (i==4)
				break;
				
			System.out.print("\n계속 입력하시겠습니까? (y입력하면 계속) : ");
			command = sc.next();
			if (command.equals("y")==false) {	// "y"가 아닌 다른 키를 누르면 break
				break;
			}
		}
		
		System.out.println("\n****TOEIC 시험 결과****");
		for (int i=0; i<name.length; i++) {
			if (name[i]==null) // name이 null이면 break 걸어서 출력 종료
			//if (grammar[i] == 0)	
				break;
			System.out.println((i+1) + "번 " + name[i] + " " + total[i] + " " + score[i]);
		}
		
		sc.close();
		
	}

}
		
//		//////////////		
//		// 정답!!!
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
//		System.out.println("****TOEIC 점수 입력****");
//				
//		do {
//			System.out.print((count+1) + "번 성명 입력 : ");
//			name[count] = sc.next();
//			System.out.print((count+1) + "번 문법 점수 입력 : ");
//			gram[count] = sc.nextInt();
//			System.out.print((count+1) + "번 듣기 점수 입력 : ");
//			list[count] = sc.nextInt();
//			System.out.print((count+1) + "번 독해 점수 입력 : ");
//			read[count] = sc.nextInt();
//			
//			count = count + 1;
//			
//			System.out.print("\n계속 입력하시겠습니까? (y입력하면 계속) : ");
//			answer = sc.next();
//		} while(answer.equals("y") && (count<5));
//		
//		System.out.println("\n****TOEIC 시험 결과****");
//		for (int i=0; i<count; i++) {
//			total = gram[i] + list[i] + read[i];
//			
//			switch (total / 200) {
//				case 4 : grade = "1등급"; break;
//				case 3 : grade = "2등급"; break;
//				case 2 : grade = "3등급"; break;
//				default : grade = "4등급";
//			}
//
//			System.out.println((i+1) + "번 " + name[i] + " " + total + " " + grade);
//		}		
//		
//		sc.close();
//		
//	}
//
//}
