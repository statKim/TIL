import java.util.Scanner;

public class CardMemberEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, cardNum, gender, job;
		int age, count, price, num;
		
		System.out.print("회원 수 입력 : ");
		num = sc.nextInt();
		
		CardMember[] cm = new CardMember[num];
		
		System.out.print("\n****회원 정보 입력****");
		for (int i=0; i<cm.length; i++) {
			System.out.print("\n회원명" + (i+1) + " : ");
			name = sc.next();
			
			System.out.print("카드번호 : ");
			cardNum = sc.next();
			
			System.out.print("나이 : ");
			age = sc.nextInt();
			
			System.out.print("성별 : ");
			gender = sc.next();
			
			System.out.print("직업 : ");
			job = sc.next();
			
			System.out.print("카드 이용 횟수 : ");
			count = sc.nextInt();
			
			System.out.print("총 사용 금액 : ");
			price = sc.nextInt();
			
			cm[i] = new CardMember(name, cardNum, age, gender, job, count, price);
		}
		
		System.out.println("\n****회원 정보 출력****\n");
		for (int i=0; i<cm.length; i++) {
			cm[i].showcardinfo();
			System.out.println();
		}
		
		sc.close();

	}

}
