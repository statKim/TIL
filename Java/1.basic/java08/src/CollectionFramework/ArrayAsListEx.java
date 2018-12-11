package CollectionFramework;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("홍길동","신용권","감자바");	//고정된 길이로 생성
		for (String name:list1) {
			System.out.println(name);
		}
		//list1.add("김현성");	// 길이 고정돼있기 때문에 값 추가 불가능!!!
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for (int value:list2) {
			System.out.println(value);
		}

	}

}
