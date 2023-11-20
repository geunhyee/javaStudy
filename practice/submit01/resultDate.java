package practice.submit01;

import java.util.Calendar;

public class resultDate {

	public static void main(String[] args) {
		makeCaleendar(2023, 9);

	}

	//월~ 금요일까지 출력하는 메서드를 만들어보세요
	//input: 년, 월
	//Mon Tue Wed Thu Fri
	
	public static void makeCaleendar(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		int lastDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		int startDay = calendar.getActualMaximum(calendar.DAY_OF_WEEK);
		System.out.println(year + "년" + month +"월");
		System.out.println("Mon\tTue\tWed\tThu\tFri");
		
		int currentDay = 1;
		int dayOfWeek = startDay -1 ;
		for(int i = 1; i <= lastDay+dayOfWeek; i++) {
			if(i <= dayOfWeek || currentDay > lastDay) {
				System.out.print("\t");  
			}else {
				System.out.printf("%d\t", currentDay);
				currentDay++;
			}
			if(i % 5==0) {
			System.out.println();
		
		}
		
		}
		

	}
}

