package CollectionFramework;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("JAVA");	//��ü ����
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");	// 2th index�� ����
		list.add("iBATIS");
		
		int size = list.size();	//����� �� ��ü��
		System.out.println("�� ��ü�� : " + size);
		System.out.println();
		
		String skill = list.get(2);	//2�� �ε����� ��ü ���
		System.out.println("2 : " + skill);
		System.out.println();
		
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2);	// 2th index�� ��ü ����
		list.remove(2);
		list.remove("iBATIS");
		//list.clear();	// ��� ���� ����
		
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
	}

}
