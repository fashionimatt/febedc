package com.bit.day16;

import java.util.Date;

public class Ex14 {


	public static void main(String[] args) {
//		Date now = new Date(2002-1900,5-1,1,12,0);
		Date now = new Date(System.currentTimeMillis());
		Date tomorrow = new Date("Sat, 12 Aug 1995 13:30:39 GMT");
		Date bday = new Date(1991-1900,9,7,19,0);
		long nowDiff=now.getTime();
		long bdayDiff= bday.getTime();

		char[] chs = {'일', '월', '화', '수', '목', '금', '토'};
		//24*60*60*1000
		
		System.out.print(now.getYear()+1900+"년 ");
		System.out.print(now.getMonth()+1+"월 ");
		System.out.print(now.getDate()+"일 ");
		System.out.print(chs[now.getDay()]+"요일\t");
		System.out.print(now.getHours()+"시 ");
		System.out.print(now.getMinutes()+"분 ");
		System.out.println(now.getSeconds()+"초");
		
		System.out.println(tomorrow.after(now));
		System.out.println(tomorrow.before(now));
		System.out.println(now.compareTo(tomorrow));
		System.out.println(Date.parse("Sat, 12 Aug 1995 13:30:39 GMT"));
		System.out.println("숨 쉬기 시작하신 지 " + (nowDiff - bdayDiff)/1000 + "초가 지났습니다");
	}

}
