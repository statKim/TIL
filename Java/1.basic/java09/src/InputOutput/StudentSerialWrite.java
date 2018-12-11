package InputOutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSerialWrite {

	public static void main(String[] args) throws Exception{

		//직렬화
		Student std = new Student("2018001","홍길동","컴퓨터");
		System.out.println(std.getName() + "\t" + std.getId() + "\t" + std.getMajor());
		
		//직렬화를 통해 std 객체 저장
		//1.파일 선택
		FileOutputStream fsOut = new FileOutputStream("std.bin");
		//2.저장
		ObjectOutputStream osOut = new ObjectOutputStream(fsOut);
		osOut.writeObject(std);
		osOut.close();
	}

}
