package com.bit.day17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;

public class Ex17 extends java.awt.Frame {

	public Ex17(){
//		java.awt.FlowLayout layout = new FlowLayout(); //요소를 요청한 순서대로 가운데에 정리함
//		java.awt.GridLayout layout = new GridLayout(2,2);
		java.awt.BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		
//		java.awt.Panel p1 = new Panel();
//		p1.setLayout(layout);
		
		java.awt.Button btn1 = new Button();
		btn1.setLabel("Button1");
		this.add(btn1,BorderLayout.NORTH);
		Button btn2 = new Button();
		btn2.setLabel("Button2");
		this.add(btn2,BorderLayout.CENTER);
		Button btn3 = new Button();
		btn3.setLabel("Button3");
		this.add(btn3,BorderLayout.WEST);
		Button btn4 = new Button();
		btn4.setLabel("Button4");
		this.add(btn4,BorderLayout.SOUTH);
		Button btn5 = new Button();
		btn5.setLabel("Button5");
		this.add(btn5,BorderLayout.EAST);
//		Button btn6 = new Button();
//		btn6.setLabel("Button6");
//		p1.add(btn6);
//		Button btn7 = new Button();
//		btn7.setLabel("Button7");
//		p1.add(btn7);
		
//		this.add(p1);
		this.setLocation(200, 300);
		this.setSize(300, 180);
		this.setVisible(true);
//		p1.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex17();
	}

}
