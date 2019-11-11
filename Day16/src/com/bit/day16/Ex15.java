package com.bit.day16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex15 {

	public static void main(String[] args) {
		Date now = new Date();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
//		df = DateFormat.getDateInstance(DateFormat.SHORT);
//		df = DateFormat.getDateInstance(DateFormat.DEFAULT);
//		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		df = DateFormat.getDateInstance(DateFormat.FULL);


		String myString = df.format(now);
		 
		System.out.println(now);
		System.out.println(myString);
		SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		
		String msg = sdf.format(now);
		System.out.println(msg);

	}

}
