package com.bit.day18;

import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class Ex05 extends Frame {

	public Ex05(){
		
		Panel p1 = new Panel();
		
		List list = new List(5,true);
		//List(int a, boolean b)
		//a = 출력할 선택지의 갯수, b = 다중선택가능여부
		list.addItem("Item 1");
		list.addItem("Item 2");
		list.addItem("Item 3");
		list.addItem("Item 4");
		list.addItem("Item 5");
		list.addItem("Item 6");
		list.addItem("Item 7");
		
		
		p1.add(list);
		add(p1);
		setBounds(200,200,400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

}
