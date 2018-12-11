package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileRead {
	
	public static void main(String[] args) {
		
		//���� ����
		Path book = Paths.get("book.txt");
		
		//�б� / �ѱ��� "Charset.forName("euc-kr")" �ɼ� �ʿ�!!
		try {
			BufferedReader reader = Files.newBufferedReader(book, Charset.forName("euc-kr"));
			String line = reader.readLine(); //ù ���� �а�
			while (line != null) {			 //������ ������ �ʾҴٸ�
				System.out.println(line);	 //���� ���� ����ϰ�
				line = reader.readLine();	 //���� ���� ����
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
		
	}

}
