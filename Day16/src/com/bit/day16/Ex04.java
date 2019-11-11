package com.bit.day16;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04 {
	static Ex04 me;
	
	public static void func01(){
		System.out.println("my func01...");
	}
	
	public static void main(String[] args) {
		//System
		
		InputStream var2 = System.in;
		//System 타입의 클래스에서 in이라는 메소드를 인자로 준 것
		Ex04.me.func01();
		
		PrintStream var1 = System.out;
		//System 타입의 클래스에서 out이라는 메소드를 인자로 준 것
		var1.println("출력");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		long sec = System.currentTimeMillis();
		//currentTimeMillis를 만든 목적은 연산에 있음! 정확한 시간을 얻어내기 위한 것이 아님
		//소요시간 등의 계산에 사용됨
		//시스템을 클래스로 쓰는만큼 시스템에 의존적임. 운영체제의 시간이 바뀌면 수치도 바뀜.
		System.out.println(sec);
		System.out.println(Long.MAX_VALUE);
		//하루는 24시간인데 1시간은 60분 1분은 60초를 기준으로 하여 단위가 다르기 때문에
		//컴퓨터는 날짜 계산하는 것을 힘들어한다.
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Map<String,String> env = System.getenv();
		Set<String> keys = env.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			System.out.println(key + " : " + env.get(key));
		}
		//현재 시스템 환경을 볼 수 있게끔 해주는 코드
		System.out.println(System.nanoTime());
		
		
		//currenTimeMills의 계산은 1970년대 1월부터를 기준으로 한다.(기원전과 서기를 나누는 0년이 아님!)(
	}

}
