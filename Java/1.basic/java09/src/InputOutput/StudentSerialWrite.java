package InputOutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSerialWrite {

	public static void main(String[] args) throws Exception{

		//����ȭ
		Student std = new Student("2018001","ȫ�浿","��ǻ��");
		System.out.println(std.getName() + "\t" + std.getId() + "\t" + std.getMajor());
		
		//����ȭ�� ���� std ��ü ����
		//1.���� ����
		FileOutputStream fsOut = new FileOutputStream("std.bin");
		//2.����
		ObjectOutputStream osOut = new ObjectOutputStream(fsOut);
		osOut.writeObject(std);
		osOut.close();
	}

}
