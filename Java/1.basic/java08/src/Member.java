
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
//		System.out.println("************************��������Ʈ ��� ����*********************");
//		System.out.println("���̵�\tȸ����\t����\t����ó\t����\t����");
		System.out.println(id + "\t" + name + "\t" + age + "\t" + phone
							+ "\t" + sex + "\t" + job);
	}
}
