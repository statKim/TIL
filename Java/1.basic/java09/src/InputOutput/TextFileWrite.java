package InputOutput;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileWrite {

	public static void main(String[] args) {

		//선택 : 파일이 없으면 새로 생성
		Path note = Paths.get("note.txt");
		
		//파일에 쓰기
		try {
			BufferedWriter writer = Files.newBufferedWriter(note, StandardCharsets.UTF_8);
			writer.write("Hello");
			writer.newLine();
			writer.write("Who are you?");
			writer.newLine();
			writer.write("Web Programming");
			writer.flush();	//메모리에 기억하고 있는 내용을 하드디스크에 저장
			writer.close();
		} catch (IOException e) {
			System.out.println("파일에 쓸 수 없습니다.");
		}

	}

}
