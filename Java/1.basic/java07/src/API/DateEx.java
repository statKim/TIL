package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		Date now = new Date();				// ���� �ð� ��ü ����
		String strNow1 = now.toString();	// String �������� ����
		System.out.println(strNow1);
		
		//�ð� ��� ���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);	// �ð� ��� ���� ����
		System.out.println(strNow2);

	}

}
