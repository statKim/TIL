
public class CourseEx {

	public static void main(String[] args) {

		Course[] co = new Course[3];	// ũ�Ⱑ 3�� �迭 ����
		
		System.out.println("****���� ���� �Է�****");
		for (int i=0; i<co.length; i++) { // co.length = 3
			co[i] = new Course();	// ��ü ����
			co[i].input();
		}
		
		System.out.println("\n****���� ���� ���****");
		for (int i=0; i<co.length; i++) {
			co[i].output();
		}

	}

}
