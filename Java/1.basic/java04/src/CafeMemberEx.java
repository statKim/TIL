
public class CafeMemberEx {

	public static void main(String[] args) {

		CafeMember cm = new CafeMember("Java Study", 20);
		
		cm.showCafeInfo();
		cm.join();
		cm.showMemTotal();
		cm.leave();
		cm.showMemTotal();
	}

}
