package com.bit.day18;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex06 extends Frame{

	public Ex06(){
		GridLayout layout = new GridLayout(4,4);
		GridLayout layout2 = new GridLayout(1,4);
		TextField tf = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		Label[] label = new Label[8];
		String[] msg = {"회원가입", "", "ID", "P/W", "이름", "취미", "학력", "자기소개"};
		for(int i=0; i<label.length; i++){
			Label l1 = new Label(msg[i]);
			label[i] = l1;
		}
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox box1 = new Checkbox("운동",false,cbg);
		Checkbox box2 = new Checkbox("독서",false,cbg);
		Checkbox box3 = new Checkbox("게임",false,cbg);
		Choice cho = new Choice();
		cho.add("고졸");
		cho.add("초대졸");
		cho.add("대졸");
		cho.add("대학원");
		
		TextArea ta = new TextArea(10,15);
		
		setLayout(new GridLayout(4,1));
		
		p2.setLayout(layout);
		p2.add(label[0]);
		p2.add(label[1]);
		p2.add(label[2]);		
		p2.add(tf);
		p2.add(label[3]);
		p2.add(tf2);
		p2.add(label[4]);
		p2.add(tf3);
		add(p2);
		
		p1.setLayout(new GridLayout(1,4));
		p1.add(label[5]);
		p1.add(box1);
		p1.add(box2);
		p1.add(box3);
		add(p1);
		
		p3.setLayout(new GridLayout(1,4));
		p3.add(label[6]);
		p3.add(cho);
		add(p3);
		
		p4.setLayout(new GridLayout(2,1));
		p4.add(label[7]);
		p4.add(ta);
		add(p4);
		
		setBounds(200,200,400,400);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Ex06();
	}

}
