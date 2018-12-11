
public class KHSarrayCopy {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		int[] newIntArray2 = new int[5];
		
		// for문을 이용한 배열 복사
		for (int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		System.out.println();
		
		//arraycopy()함수를 이용한 배열 복사
		//System.arraycopy(원본, 시작 인덱스, 대상, 시작인덱스, 가져올 개수); => 
		System.arraycopy(oldIntArray, 0, newIntArray2, 0, oldIntArray.length);
		//"가져올 개수"가 "원본의 시작인덱스"부터 가져오는 것보다 개수가 많으면 에러
		//System.arraycopy(oldIntArray, 2, newIntArray2, 1, oldIntArray.length);
		//System.arraycopy(oldIntArray, 0, newIntArray2, 1, 1);	//0,1,0,0,0,
		for (int i=0; i<newIntArray2.length; i++) {
			System.out.print(newIntArray2[i] + ", ");
		}

	}

}
