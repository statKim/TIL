
public class PersonEx {

	public static void main(String[] args) {
		
		Person[] p = new Person[3];	// 3��¥�� �迭 ����
		
		System.out.println("****���� ���� �Է�****");
		for (int i=0; i<p.length; i++) { // p.length = 3
			p[i] = new Person();	// ��ü ����
			p[i].input();
		}
		
		System.out.println("\n****���� ���� ���****");
		for (int i=0; i<p.length; i++) {
			p[i].output();
		}
	}

}
