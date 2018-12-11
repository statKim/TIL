
public class Member {
	
	String id, name, phone, sex, job;
	int age;
	
	public Member(String id, String name, int age, String phone,
					String sex, String job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.sex = sex;
		this.job = job;
	}
	
	public void showMemberInfo() {
//		System.out.println("************************누적포인트 등급 내역*********************");
//		System.out.println("아이디\t회원명\t나이\t연락처\t성별\t직업");
		System.out.println(id + "\t" + name + "\t" + age + "\t" + phone
							+ "\t" + sex + "\t" + job);
	}
}
