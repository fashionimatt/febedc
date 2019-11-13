package com.bit.day18;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;

public class Ex04 extends Frame{

	public Ex04(){
		
		Panel p1 = new Panel();
		
		Choice cho = new Choice();
		cho.addItem("Item1");
		cho.addItem("Item2");
		cho.addItem("Item3");
		cho.addItem("Item4");
		cho.addItem("Item5");
		
		p1.add(cho);
		add(p1);
		setBounds(200,200,400,400);
		//setBounds(int a,int b,int c,int d)
		//a와b는 setLocation, c와d는 setSize
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
