
public class Book {
	
	String title;
	String author;
	int price;
	
	// 매개변수가 없는 생성자
	public Book() {
		this("자바스크립트", "이몽룡", 22000);
	}
	
	// 매개변수가 없는 생성자 - 객체 생성 시 값 전달 받아서 멤버 필드 초기화
	public Book(String t, String au, int p) {
		title = t;
		author = au;
		price = p;
	}
	
	public void show() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price);
	}
}
