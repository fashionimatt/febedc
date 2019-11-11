package com.bit.day16;

public class Ex03 {

	public static void main(String[] args) {
		StringBuilder msg1 = new StringBuilder("builder");
		StringBuilder msg2 = new StringBuilder("String");
		//+
		System.out.println(msg1.append(msg2));
		System.out.println(msg1.delete(7, 10));
		System.out.println(msg1.reverse());
		//append 제어에는 어떤 형태의 자료든 들어갈 수 있다.(Object도 들어갈 수 있기 때문)
		
	}

}
