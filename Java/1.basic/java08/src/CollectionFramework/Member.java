package CollectionFramework;

public class Member {

	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//name�� age ���� ������ true ��ȯ(Ÿ��, ���� �� ��)
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {	// A instanceof B : A�� B�� Ÿ�� �� 
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}
	
	//name�� age ���� ������ ������ hashCode�� ����
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
}
