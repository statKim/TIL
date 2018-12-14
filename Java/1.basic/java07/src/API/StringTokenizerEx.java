package API;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		//how1 : ��ü ��ū ���� ��� for������ ����
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for (int i=0; i<countTokens; i++ ) {	//������ �ʰ� ���� �ִ� ��ū�� ��
			String token = st.nextToken();		//��ū�� �ϳ��� ������
			System.out.println(token);
		}
		
		System.out.println();
		
		//how2 : ���� �ִ� ��ū�� Ȯ���ϰ� while������ ����
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {			//�����ִ� ��ū�� �ִ��� ����
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}

}