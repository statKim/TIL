package CollectionFramework;

public class Member {

	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//name과 age 값이 같으면 true 반환(타입, 내부 값 비교)
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {	// A instanceof B : A와 B의 타입 비교 
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}
	
	//name과 age 값이 같으면 동일한 hashCode가 리턴
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
}
