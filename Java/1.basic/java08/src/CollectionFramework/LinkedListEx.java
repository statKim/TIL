package CollectionFramework;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// for문 다 도는데 걸리는 시간 체크
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));	// add로 앞쪽으로 새로운 원소 추가
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime-startTime) + " ns");
	}

}
