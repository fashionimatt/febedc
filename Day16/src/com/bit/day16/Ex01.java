package com.bit.day16;

public class Ex01 {

	public static void main(String[] args) {
		String msg0 = "java" + "Web";
		String msg1= "java".concat("Web");
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer msg2 = new StringBuffer("Buffer");
//		StringBuffer msg3 = "buffer class"; //무조건 생성자를 통해서 입력을 해야함!
		
		StringBuffer msg3 = new StringBuffer(" class");
		StringBuffer msg4 = new StringBuffer("의 +");
		System.out.println(msg0=="javaWeb");
		System.out.println(msg1=="javaWeb");
		System.out.println("----------------------------");
		System.out.println(sb);
		System.out.println(msg2.append(msg3).append(msg4));
		System.out.println("----------------------------");
		System.out.println(msg2); 
		
		//String 클래스는 제어가 들어갈 때마다 계속 새로운 객체를 생성해야 하지만
		//StringBuffer/StringBuilder는 본래의 객체 내에서 수정이 이루어짐. 제어를 하는 순간 바뀜.
		//StringBuffer/StringBuilder는 String과는 다른 제어 구조를 가지고 있기 때문에
		//익숙해지는 데에 시간이 꽤 걸림
		//Ex)성적 처리 프로그램의 경우 학생이 3-4명일 때는 그렇게 크게 상관이 없지만
		//학생이 천 명,만 명이 되면 String을 이용할 시, 매번 객체를 생성해야 하기 때문에 자원 소모가 너무 크다.
	}

}
