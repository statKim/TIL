package API;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		//Calendar 클래스는 추상클래스이기 때문에 "new" 연산자로 객체 생성 불가! (Singleton) 
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY :	//상수 이름 사용(실제 값으로 저장돼 있음)
			strWeek = "월";
			break;
		case Calendar.TUESDAY :
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY :
			strWeek = "수";
			break;
		case Calendar.THURSDAY :
			strWeek = "목";
			break;
		case Calendar.FRIDAY :
			strWeek = "금";
			break;
		case Calendar.SATURDAY :
			strWeek = "토";
			break;
		default :
			strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초");
	}

}
