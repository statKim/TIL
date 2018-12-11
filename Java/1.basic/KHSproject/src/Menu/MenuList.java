package Menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MenuList {

	public List<Map<String,String>> menu_list = new ArrayList<Map<String,String>>();
	
	// 데이터 읽어오는 메소드
	public void readData() {
		Path book = Paths.get("menu_list.txt");
		try {
			BufferedReader reader = Files.newBufferedReader(book, Charset.forName("euc-kr"));
			String line = reader.readLine();
			while (line != null) {			 
				String[] lines = line.split(",");
				Map<String,String> map = new HashMap<String, String>();
				map.put("가게명", lines[0]);
				map.put("메뉴", lines[1]);
				map.put("위치", lines[2]);
				map.put("가격", lines[3]);
				menu_list.add(map);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}	
	}	
	
	// 데이터 추가하는 메소드
	public void addList() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가게명 : ");
		String store = sc.next();
		System.out.print("메뉴 : ");
		String food = sc.next();
		System.out.print("위치 : ");
		String location = sc.next();
		System.out.print("가격 : ");
		String price = sc.next();
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("가게명", store);
		map.put("메뉴", food);
		map.put("위치", location);
		map.put("가격", price);
		menu_list.add(map);		
		
		Path list = Paths.get("menu_list.txt");		
		try {
			BufferedWriter writer = Files.newBufferedWriter(list, Charset.forName("euc-kr"));
			for (int i=0; i<menu_list.size(); i++) {
				Map<String,String> mapa = menu_list.get(i);
				writer.write(mapa.get("가게명") + "," + mapa.get("메뉴") + ","
										+ mapa.get("위치") + "," + mapa.get("가격"));
				writer.newLine();
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("파일에 쓸 수 없습니다.");
		}
		sc.close();
	}
	
	// 전체 출력 메소드
	public void showListAll(List<Map<String,String>> list) {
		for (int i=0; i<list.size();i++) {
		Map<String,String> map = list.get(i);
		System.out.println(map.get("가게명") + "\t" + map.get("메뉴") + "\t"
							+ map.get("위치") + "\t" + map.get("가격"));	
		}
	}
	
	// 랜덤하게 고르는 메소드
	public void showRandom(List<Map<String,String>> list) {
		Random r = new Random();
		int x = r.nextInt(list.size());
		
		System.out.println("가게명\t메뉴\t위치\t가격");
		Map<String,String> mapa = list.get(x);
		System.out.println(mapa.get("가게명") + "\t" + mapa.get("메뉴") + "\t"
								+ mapa.get("위치") + "\t" + mapa.get("가격"));	
	}
	
}
