package test;

import java.util.Scanner;

public class capitalTest {

	Scanner sc = new Scanner(System.in);
	
	String[] question = new String[] {"미국","영국","프랑스","독일","중국"};
	String[] answer = new String[] {"워싱턴","런던","파리","베를린","베이징"};
	int score = 0;
	
	public void startTest() {
		System.out.println("시험시작");
		System.out.println("--------------------");
		System.out.println("다음의 국가에 해당되는 수도 입력");
		System.out.println("--------------------");
		for (int i=0; i<question.length; i++) {
			System.out.print(question[i] + " : ");
			String ans = sc.next();
			if (answer[i].equals(ans)) {
				score = score + 20;
			}
			System.out.println("점수 : " + score);
		}
		System.out.println("--------------------");
		System.out.println("시험결과");
		System.out.println("--------------------");
		if (score>=60) {
			System.out.println("결과 : 합격");
		} else {
			System.out.println("결과 : 불합격");
		}
	}
	
}
