package com.bit.day16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex13 {

	
	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
		//Calendar�� �ڽ�Ŭ������ Calendar�ε� ���� ����
		
		gc = new GregorianCalendar(2002,4,1,12,0,0);
		
		System.out.print(gc.get(Calendar.YEAR) + "�� ");
		System.out.print(gc.get(Calendar.MONTH) + "�� ");
		System.out.print(gc.get(Calendar.DAY_OF_MONTH) + "��\t");
		System.out.print(gc.get(Calendar.HOUR_OF_DAY) + "�� ");
		System.out.print(gc.get(Calendar.MINUTE) + "�� ");
		System.out.print(gc.get(Calendar.SECOND) + "��");


	}

}
