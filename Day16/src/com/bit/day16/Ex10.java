package com.bit.day16;

public class Ex10 {

	protected Object clone() throws CloneNotSupportedException {
		return new Ex10();
	}
	
	public int hashcode(){
		return 16;
	}
	
	public String toStiring() {
		return "³ª";
	}
	
	public boolean equals(Object obj){
		return this.num==((Ex10)obj).num;
	}
	
	int num = 16;
	public static void main(String[] args) {
		///Object class
		
		Object obj = new Object();
//		obj.clone();
		Ex10 me = new Ex10();
		Object you = null;
		try{
			you = me.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
	}
}
