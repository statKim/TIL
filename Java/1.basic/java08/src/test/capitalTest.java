package test;

import java.util.Scanner;

public class capitalTest {

	Scanner sc = new Scanner(System.in);
	
	String[] question = new String[] {"�̱�","����","������","����","�߱�"};
	String[] answer = new String[] {"������","����","�ĸ�","������","����¡"};
	int score = 0;
	
	public void startTest() {
		System.out.println("�������");
		System.out.println("--------------------");
		System.out.println("������ ������ �ش�Ǵ� ���� �Է�");
		System.out.println("--------------------");
		for (int i=0; i<question.length; i++) {
			System.out.print(question[i] + " : ");
			String ans = sc.next();
			if (answer[i].equals(ans)) {
				score = score + 20;
			}
			System.out.println("���� : " + score);
		}
		System.out.println("--------------------");
		System.out.println("������");
		System.out.println("--------------------");
		if (score>=60) {
			System.out.println("��� : �հ�");
		} else {
			System.out.println("��� : ���հ�");
		}
	}
	
}
