package com.bit.day16;

import java.util.Calendar;

public class Ex11 {

	public static void main(String[] args) {
		//��¥ �ð�
		char[] ch={'��', '��', 'ȭ', '��', '��', '��', '��'};
		Calendar cal =Calendar.getInstance();
		
		cal.set(2002,4,1,0,0);
		
		System.out.print(cal.get(cal.YEAR)+"�� ");
		System.out.print(cal.get(cal.MONTH)+1+"�� ");
		System.out.print(cal.get(cal.DATE)+"�� ");
		System.out.print(ch[cal.get(cal.DAY_OF_WEEK)-1]+"����");
		//1.�� 2.�� 3.ȭ 4.�� 5.�� 6.�� 7.��
		System.out.print("\t");
		if(cal.get(cal.AM)==0){
			System.out.print("AM ");
//			System.out.print(cal.get(cal.HOUR)+"�� "); //12�� ����
		} else{
			System.out.print("PM ");
//			System.out.print(cal.get(cal.HOUR)+"�� "); //12�� ����
		} 
		//������0�̰� ���Ĵ�1�̴�.
		System.out.print(cal.get(cal.HOUR_OF_DAY)+"�� ");//24�� ����
		System.out.print(cal.get(cal.MINUTE)+"�� ");
		System.out.println(cal.get(cal.SECOND)+"�� ");
		System.out.println(cal.get(cal.YEAR)+1+"����� "+(365-cal.get(cal.DAY_OF_YEAR))+"�� ���ҽ��ϴ�.");
		System.out.println((cal.get(cal.MONTH)+1)+"�� "+cal.get(cal.WEEK_OF_MONTH)+"�����Դϴ�.");
		System.out.println(cal.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		
	}

}
