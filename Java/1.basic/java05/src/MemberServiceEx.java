
public class MemberServiceEx {

	public static void main(String[] args) {

		MemberService ms = new MemberService();
		
		boolean result = ms.login("hong", "12345");
		
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			ms.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}

	}

}
