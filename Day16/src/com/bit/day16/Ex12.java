package com.bit.day16;

import java.util.Calendar;

public class Ex12 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2019,10-1,21,0,0);
		int enterDay = cal.get(Calendar.DAY_OF_YEAR);
		int enterWeek = cal.get(Calendar.WEEK_OF_YEAR);
		
		Calendar birth = Calendar.getInstance();
		cal.set(1991,10-1,7);
		
		
		Calendar now = Calendar.getInstance();
		int today = now.get(Calendar.DAY_OF_YEAR);
		int todayWeek = now.get(Calendar.WEEK_OF_YEAR);
		
		System.out.print("�п��� ������ ");
		System.out.println(((today-enterDay)+1) + "�� �� �Ǽ̽��ϴ�!");
		System.out.println(((todayWeek-enterWeek)+1)+"�� ���̸�");
		
	}

}
