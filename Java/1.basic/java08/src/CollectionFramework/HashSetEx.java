package CollectionFramework;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		//Java�� �� ���� �����
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// �ߺ��Ǽ� �߰� �ȵ�
		set.add("iBATIS");
		
		int size = set.size();	//����� �� ��ü��
		System.out.println("�� ��ü�� : " + size);
		
		Iterator<String> iterator = set.iterator();	//�ݺ��� ���
		while (iterator.hasNext()) {				//��ü ����ŭ �ݺ�
			String element = iterator.next();		//�� ���� ��ü�� ������
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü�� : " + set.size());
		
		for (String element:set) {
			System.out.println("\t" + element);
		}
		
		set.clear();	//��� ��ü ����
		if (set.isEmpty()) {
			System.out.println("��� ����");
		}
	}

}
