
public class Singleton {
	
		// Ŭ���� �ڽ��� Ÿ������ static �ʵ� ����
		private static Singleton singleton = new Singleton();
		
		private Singleton() {}	// �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ private
		
		static Singleton getInstance() {	// �ܺο��� ȣ���� �� ���� static �޼ҵ� ���
			return singleton;
		}
	
}
