
public class KHSarrayCopy {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		int[] newIntArray2 = new int[5];
		
		// for���� �̿��� �迭 ����
		for (int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		System.out.println();
		
		//arraycopy()�Լ��� �̿��� �迭 ����
		//System.arraycopy(����, ���� �ε���, ���, �����ε���, ������ ����); => 
		System.arraycopy(oldIntArray, 0, newIntArray2, 0, oldIntArray.length);
		//"������ ����"�� "������ �����ε���"���� �������� �ͺ��� ������ ������ ����
		//System.arraycopy(oldIntArray, 2, newIntArray2, 1, oldIntArray.length);
		//System.arraycopy(oldIntArray, 0, newIntArray2, 1, 1);	//0,1,0,0,0,
		for (int i=0; i<newIntArray2.length; i++) {
			System.out.print(newIntArray2[i] + ", ");
		}

	}

}
