package com.bit.day16;

import java.util.Calendar;

public class Ex11 {

	public static void main(String[] args) {
		//날짜 시간
		char[] ch={'일', '월', '화', '수', '목', '금', '토'};
		Calendar cal =Calendar.getInstance();
		
		cal.set(2002,4,1,0,0);
		
		System.out.print(cal.get(cal.YEAR)+"년 ");
		System.out.print(cal.get(cal.MONTH)+1+"월 ");
		System.out.print(cal.get(cal.DATE)+"일 ");
		System.out.print(ch[cal.get(cal.DAY_OF_WEEK)-1]+"요일");
		//1.일 2.월 3.화 4.수 5.목 6.금 7.토
		System.out.print("\t");
		if(cal.get(cal.AM)==0){
			System.out.print("AM ");
//			System.out.print(cal.get(cal.HOUR)+"시 "); //12시 기준
		} else{
			System.out.print("PM ");
//			System.out.print(cal.get(cal.HOUR)+"시 "); //12시 기준
		} 
		//오전은0이고 오후는1이다.
		System.out.print(cal.get(cal.HOUR_OF_DAY)+"시 ");//24시 기준
		System.out.print(cal.get(cal.MINUTE)+"분 ");
		System.out.println(cal.get(cal.SECOND)+"초 ");
		System.out.println(cal.get(cal.YEAR)+1+"년까지 "+(365-cal.get(cal.DAY_OF_YEAR))+"일 남았습니다.");
		System.out.println((cal.get(cal.MONTH)+1)+"월 "+cal.get(cal.WEEK_OF_MONTH)+"주차입니다.");
		System.out.println(cal.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		
	}

}
