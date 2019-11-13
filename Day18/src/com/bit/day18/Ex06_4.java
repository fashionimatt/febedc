package com.bit.day18;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex06_4 extends Frame{
	
	public Ex06_4(){
		BorderLayout lay1 = new BorderLayout();
		BorderLayout lay2 = new BorderLayout();
		GridLayout lay3 = new GridLayout(6,1);
		GridLayout lay4 = new GridLayout(6,1);
		setLayout(lay1);
		Panel center = new Panel();
		Panel center1 = new Panel();
		Panel center2 = new Panel();
		center.setLayout(lay2);
		center1.setLayout(lay2);
		center2.setLayout(lay2);
		
		
		/////////필요한 구성요소들/////////
		Label la1 = new Label("회원가입");		
		Label la2 = new Label("ID");		
		Label la3 = new Label("P/W");		
		Label la4 = new Label("이름");		
		Label la5 = new Label("취미");		
		Label la6 = new Label("학력");		
		Label la7 = new Label("자기소개");
		
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox box1 = new Checkbox("운동",false,cbg);
		Checkbox box2 = new Checkbox("게임",false,cbg);
		Checkbox box3 = new Checkbox("독서",false,cbg);
		
		Choice cho = new Choice();
		cho.add("고졸");
		cho.add("초대졸");
		cho.add("대졸");
		cho.add("대학원");
		
		TextArea ta = new TextArea();
		///////////////////////////////////		
		center1.add(la2);		
		center1.add(la3);		
		center1.add(la4);		
		center1.add(la5);		
		center1.add(la6);		
		center1.add(la7);	
		
		center2.add(tf1);
		center2.add(tf2);
		center2.add(tf3);
		Panel radio = new Panel();
		radio.add(box1);
		radio.add(box2);
		radio.add(box3);
		center2.add(radio);
		center2.add(cho);
		
		center.add(center1,BorderLayout.WEST);
		center.add(center2,BorderLayout.CENTER);
		
		add(la1,BorderLayout.NORTH);
		add(ta,BorderLayout.SOUTH);
		add(center,BorderLayout.CENTER);
		///////////////////////////////////
		
		setBounds(200,200,500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex06_4();
	}

}
