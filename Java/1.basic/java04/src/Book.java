
public class Book {
	
	String title;
	String author;
	int price;
	
	// �Ű������� ���� ������
	public Book() {
		this("�ڹٽ�ũ��Ʈ", "�̸���", 22000);
	}
	
	// �Ű������� ���� ������ - ��ü ���� �� �� ���� �޾Ƽ� ��� �ʵ� �ʱ�ȭ
	public Book(String t, String au, int p) {
		title = t;
		author = au;
		price = p;
	}
	
	public void show() {
		System.out.println("������ : " + title);
		System.out.println("���� : " + author);
		System.out.println("���� : " + price);
	}
}
