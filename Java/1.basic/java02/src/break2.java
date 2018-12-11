
public class KHSbreak2 {

	public static void main(String[] args) {
		
//		// 안쪽 for문만 break됨
//		for (char upper='A'; upper<='Z'; upper++) {
//			for (char lower='a'; lower<='z'; lower++) {	// 'g'를 만나면 break
//				System.out.println(upper + "-" + lower);
//				if (lower=='g') {
//					break;
//				}
//			}
//		}
//		System.out.println("프로그램 실행 종료");
		
		// 전체 for문만 break됨 - 바깥쪽 for문에 이름 붙이고 "break 이름"
		Outter : for (char upper='A'; upper<='Z'; upper++) {
			for (char lower='a'; lower<='z'; lower++) {	
				System.out.println(upper + "-" + lower);
				if (lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");

	}

}
