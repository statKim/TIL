package InputOutput;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileWrite {

	public static void main(String[] args) {

		//���� : ������ ������ ���� ����
		Path note = Paths.get("note.txt");
		
		//���Ͽ� ����
		try {
			BufferedWriter writer = Files.newBufferedWriter(note, StandardCharsets.UTF_8);
			writer.write("Hello");
			writer.newLine();
			writer.write("Who are you?");
			writer.newLine();
			writer.write("Web Programming");
			writer.flush();	//�޸𸮿� ����ϰ� �ִ� ������ �ϵ��ũ�� ����
			writer.close();
		} catch (IOException e) {
			System.out.println("���Ͽ� �� �� �����ϴ�.");
		}

	}

}
