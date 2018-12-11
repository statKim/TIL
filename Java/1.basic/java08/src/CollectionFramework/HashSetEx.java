package CollectionFramework;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		//Java는 한 번만 저장됨
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// 중복되서 추가 안됨
		set.add("iBATIS");
		
		int size = set.size();	//저장된 총 객체수
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator();	//반복자 얻기
		while (iterator.hasNext()) {				//객체 수만큼 반복
			String element = iterator.next();		//한 개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : " + set.size());
		
		for (String element:set) {
			System.out.println("\t" + element);
		}
		
		set.clear();	//모든 객체 제거
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
