package com.bit.day17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex19_1 {

	public static void main(String[] args) {
		GridLayout layout = new GridLayout(4,3);
		Frame frame = new Frame();
		frame.setLayout(layout);
		
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
		Button btns = new Button("#");
		
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btnm);
		frame.add(btn0);
		frame.add(btns);
	
		frame.setLocation(200, 300);
		frame.setSize(500,300);
		frame.setVisible(true);
	}

}
