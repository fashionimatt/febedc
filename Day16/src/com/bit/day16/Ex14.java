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

		char[] chs = {'��', '��', 'ȭ', '��', '��', '��', '��'};
		//24*60*60*1000
		
		System.out.print(now.getYear()+1900+"�� ");
		System.out.print(now.getMonth()+1+"�� ");
		System.out.print(now.getDate()+"�� ");
		System.out.print(chs[now.getDay()]+"����\t");
		System.out.print(now.getHours()+"�� ");
		System.out.print(now.getMinutes()+"�� ");
		System.out.println(now.getSeconds()+"��");
		
		System.out.println(tomorrow.after(now));
		System.out.println(tomorrow.before(now));
		System.out.println(now.compareTo(tomorrow));
		System.out.println(Date.parse("Sat, 12 Aug 1995 13:30:39 GMT"));
		System.out.println("�� ���� �����Ͻ� �� " + (nowDiff - bdayDiff)/1000 + "�ʰ� �������ϴ�");
	}

}
