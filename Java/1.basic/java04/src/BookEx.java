
public class BookEx {

	public static void main(String[] args) {

		//객체 생성 시 인수에 따라 해당되는 생성자 자동 호출
		Book b1 = new Book("Java", "홍길동",20000);
		Book b2 = new Book();
		
		System.out.println("*****b1 도서*****");
		b1.show();
		
		System.out.println("\n*****b2 도서*****");
		b2.show();
	}

}
