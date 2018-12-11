package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentSerialRead {

	public static void main(String[] args) {

		//역직렬화
		FileInputStream fsIn;
		ObjectInputStream osIn;
		Student clone;
		try {
			fsIn = new FileInputStream("std.bin");
			osIn = new ObjectInputStream(fsIn);
			clone = (Student) osIn.readObject();
			osIn.close();
			System.out.println(clone.getName() + "\t" + clone.getId() + "\t" + clone.getMajor());
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		}
	}

}
