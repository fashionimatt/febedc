package com.bit.day17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex19 {

	public static void main(String[] args) {
		FlowLayout layout1 = new FlowLayout();
		GridLayout layout2 = new GridLayout(4,1);
		Frame frame = new Frame();
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		frame.setLayout(layout1);
		p1.setLayout(layout2);
		p2.setLayout(layout2);
		p3.setLayout(layout2);
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8");
		Button btn9 = new Button("9");
		Button btnm = new Button("*");
		Button btn0 = new Button("0");
		Button btns = new Button("3");
		
		p1.add(btn7);
		p1.add(btn4);
		p1.add(btn1);
		p1.add(btnm);
		frame.add(p1);
		p2.add(btn8);
		p2.add(btn5);
		p2.add(btn2);
		p2.add(btn0);
		frame.add(p2);
		p3.add(btn9);
		p3.add(btn6);
		p3.add(btn3);
		p3.add(btns);
		frame.add(p3);
		
		frame.setLocation(200, 300);
		frame.setSize(500,300);
		frame.setVisible(true);
	}

}
