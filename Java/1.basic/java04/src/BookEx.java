
public class BookEx {

	public static void main(String[] args) {

		//��ü ���� �� �μ��� ���� �ش�Ǵ� ������ �ڵ� ȣ��
		Book b1 = new Book("Java", "ȫ�浿",20000);
		Book b2 = new Book();
		
		System.out.println("*****b1 ����*****");
		b1.show();
		
		System.out.println("\n*****b2 ����*****");
		b2.show();
	}

}
