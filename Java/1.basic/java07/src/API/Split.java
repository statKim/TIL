package API;

public class Split {

	public static void main(String[] args) {

		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		
		for (String name:names) {		//names�迭���� �ϳ��� name������ �ؼ�
			System.out.println(name);
		}

	}

}
