package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		Date now = new Date();				// 현재 시간 객체 생성
		String strNow1 = now.toString();	// String 형식으로 저장
		System.out.println(strNow1);
		
		//시간 출력 형식 조정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);	// 시간 출력 형식 조정
		System.out.println(strNow2);

	}

}
