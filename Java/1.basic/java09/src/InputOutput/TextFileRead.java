package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileRead {
	
	public static void main(String[] args) {
		
		//파일 선택
		Path book = Paths.get("book.txt");
		
		//읽기 / 한글은 "Charset.forName("euc-kr")" 옵션 필요!!
		try {
			BufferedReader reader = Files.newBufferedReader(book, Charset.forName("euc-kr"));
			String line = reader.readLine(); //첫 라인 읽고
			while (line != null) {			 //라인이 끝나지 않았다면
				System.out.println(line);	 //읽은 라인 출력하고
				line = reader.readLine();	 //다음 라인 읽음
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		
	}

}
