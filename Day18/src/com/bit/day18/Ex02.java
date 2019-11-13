package com.bit.day18;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex02 {

	public static void main(String[] args) {
		Panel p1 = new Panel();
		Frame frame = new Frame();
		Font font = new Font("제주고딕",1,16);
		
		TextArea ta = new TextArea("Default",10,25,TextArea.SCROLLBARS_NONE);
		ta.setFont(font);
//		TextArea ta = new TextArea();
//		ta.setColumns(15);
//		ta.setRows(2);
//		ta.setText("초기값");
//		ta.setVisible(false);
//		ta.setEditable(false);
		//수정이 불가하게 하는 것
//		ta.setEnabled(false);
		//해당 영역을 비활성화하는 것
		
		
		
		p1.add(ta);
		frame.add(p1);
		frame.setLocation(200,200);
		frame.setSize(400,300);
		frame.setVisible(true);
		
	}

}
