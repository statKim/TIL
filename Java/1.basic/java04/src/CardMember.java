
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
			grade = "���� �����̾�";
		else if (price>=300) 
			grade = "�����̾�";
		else
			grade = "�Ϲ�";
		return grade;
	}
		
	
	public void showcardinfo() {
		System.out.println("ȸ���� : " + name);
		System.out.println("ī���ȣ : " + cardNum);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + job);
		System.out.println("ī�� �̿� Ƚ�� : " + count);
		System.out.println("�� ��� �ݾ� : " + price);
		System.out.println("��� : " + classify());
	}

	
}
