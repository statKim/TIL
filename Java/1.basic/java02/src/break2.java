
public class KHSbreak2 {

	public static void main(String[] args) {
		
//		// ���� for���� break��
//		for (char upper='A'; upper<='Z'; upper++) {
//			for (char lower='a'; lower<='z'; lower++) {	// 'g'�� ������ break
//				System.out.println(upper + "-" + lower);
//				if (lower=='g') {
//					break;
//				}
//			}
//		}
//		System.out.println("���α׷� ���� ����");
		
		// ��ü for���� break�� - �ٱ��� for���� �̸� ���̰� "break �̸�"
		Outter : for (char upper='A'; upper<='Z'; upper++) {
			for (char lower='a'; lower<='z'; lower++) {	
				System.out.println(upper + "-" + lower);
				if (lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("���α׷� ���� ����");

	}

}
