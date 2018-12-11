package CollectionFramework;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// for�� �� ���µ� �ɸ��� �ð� üũ
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));	// add�� �������� ���ο� ���� �߰�
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� : " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� : " + (endTime-startTime) + " ns");
	}

}
