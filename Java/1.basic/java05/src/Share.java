
public class Share {

		int a;				//�ν��Ͻ� �ʵ�
		static int staticA;	// static �ʵ�
		
		// ����ʵ�� �ڵ����� 0���� �ʱ�ȭ��!!(default�� a=0)
		public void set(int n) {	// �ν��Ͻ� �޼ҵ�
			a = a + n;				// ���⼭�� �ν��Ͻ�, static �ʵ� ��� ��� ����
			staticA = staticA + n;
		}
		
		public int showA() {		// �ν��Ͻ� �޼ҵ�
			return a;
		}
		
		public static int showStaticA() {	// static �޼ҵ�
			return staticA;					// static �ʵ常 ��� ����
		}
		
}
