package CollectionFramework;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("JAVA");	//객체 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");	// 2th index에 저장
		list.add("iBATIS");
		
		int size = list.size();	//저장된 총 객체수
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);	//2번 인덱스의 객체 얻기
		System.out.println("2 : " + skill);
		System.out.println();
		
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2);	// 2th index의 객체 제거
		list.remove(2);
		list.remove("iBATIS");
		//list.clear();	// 모든 원소 제거
		
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
	}

}
