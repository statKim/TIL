
public class DmbCellPhoneEx {

	public static void main(String[] args) {

		//DmbCellPhone ��ü ����
		DmbCellPhone dcp = new DmbCellPhone("�ڹ���","����",10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dcp.model);
		System.out.println("���� : " + dcp.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dcp.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("��������");
		dcp.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dcp.sendVoice("��~ �� �ݰ����ϴ�.");
		dcp.hangUp();
		//dcp.showAA();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
	}

}
