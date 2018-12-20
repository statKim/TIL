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
	
	// ������ �о���� �޼ҵ�
	public void readData() {
		Path book = Paths.get("menu_list.txt");
		try {
			BufferedReader reader = Files.newBufferedReader(book, Charset.forName("euc-kr"));
			String line = reader.readLine();
			while (line != null) {			 
				String[] lines = line.split(",");
				Map<String,String> map = new HashMap<String, String>();
				map.put("���Ը�", lines[0]);
				map.put("�޴�", lines[1]);
				map.put("��ġ", lines[2]);
				map.put("����", lines[3]);
				menu_list.add(map);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}	
	}	
	
	// ������ �߰��ϴ� �޼ҵ�
	public void addList() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���Ը� : ");
		String store = sc.next();
		System.out.print("�޴� : ");
		String food = sc.next();
		System.out.print("��ġ : ");
		String location = sc.next();
		System.out.print("���� : ");
		String price = sc.next();
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("���Ը�", store);
		map.put("�޴�", food);
		map.put("��ġ", location);
		map.put("����", price);
		menu_list.add(map);		
		
		Path list = Paths.get("menu_list.txt");		
		try {
			BufferedWriter writer = Files.newBufferedWriter(list, Charset.forName("euc-kr"));
			for (int i=0; i<menu_list.size(); i++) {
				Map<String,String> mapa = menu_list.get(i);
				writer.write(mapa.get("���Ը�") + "," + mapa.get("�޴�") + ","
										+ mapa.get("��ġ") + "," + mapa.get("����"));
				writer.newLine();
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("���Ͽ� �� �� �����ϴ�.");
		}
		sc.close();
	}
	
	// ��ü ��� �޼ҵ�
	public void showListAll(List<Map<String,String>> list) {
		for (int i=0; i<list.size();i++) {
		Map<String,String> map = list.get(i);
		System.out.println(map.get("���Ը�") + "\t" + map.get("�޴�") + "\t"
							+ map.get("��ġ") + "\t" + map.get("����"));	
		}
	}
	
	// �����ϰ� ���� �޼ҵ�
	public void showRandom(List<Map<String,String>> list) {
		Random r = new Random();
		int x = r.nextInt(list.size());
		
		System.out.println("���Ը�\t�޴�\t��ġ\t����");
		Map<String,String> mapa = list.get(x);
		System.out.println(mapa.get("���Ը�") + "\t" + mapa.get("�޴�") + "\t"
								+ mapa.get("��ġ") + "\t" + mapa.get("����"));	
	}
	
}
