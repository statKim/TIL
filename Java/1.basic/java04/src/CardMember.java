
public class CardMember {
	
	String name, cardNum, gender, job;
	int age, count, price;
	
	public CardMember(String name, String cardNum, int age, 
					String gender, String job, int count, int price) {
		this.name = name;
		this.cardNum = cardNum;
		this.age = age;
		this.gender = gender;
		this.job = job;
		this.count = count;
		this.price = price;
	}
	
	public String classify() {
		String grade;
		if (price>=500)
			grade = "슈퍼 프리미엄";
		else if (price>=300) 
			grade = "프리미엄";
		else
			grade = "일반";
		return grade;
	}
		
	
	public void showcardinfo() {
		System.out.println("회원명 : " + name);
		System.out.println("카드번호 : " + cardNum);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("직업 : " + job);
		System.out.println("카드 이용 횟수 : " + count);
		System.out.println("총 사용 금액 : " + price);
		System.out.println("등급 : " + classify());
	}

	
}
