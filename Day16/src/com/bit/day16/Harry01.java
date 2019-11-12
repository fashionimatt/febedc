package com.bit.day16;

interface MyInterface{
	
	int Value = 5;
	
	int calculate(int a);
	
}

public class Harry01 {

	public static void main(String[] args) {

		CalculateA add = new CalculateA();
		CalculateM mult = new CalculateM();
		int num = 5;
		
		System.out.println(add.calculate(num));
		System.out.println(mult.calculate(num));
		
	}
}

class CalculateA implements MyInterface {

	@Override
	public int calculate(int a) {
		return Value+a;
	}
	
}

class CalculateM implements MyInterface{

	@Override
	public int calculate(int a) {
		return Value*a;
	}
	
	
}
