package com.bit.day18;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class Ex12 {

	public static void main(String[] args) {
		Frame frame = new Frame("Frame 실전연습");
		
		
		Menu mn1 = new Menu();
		mn1.setLabel("File");
		
		
		MenuItem mni1 = new CheckboxMenuItem("Mode",true);
		MenuItem mni2 = new	Menu("상위메뉴");
		
		Menu mn2 = new Menu("Edit");
		mn2.add(mni1);
		mn2.add(mni2);
		
		MenuItem mnItem1 = new MenuItem();
		mnItem1.setLabel("Welcome");
		MenuItem mnItem2 = new MenuItem("About");
		
		Menu mn3 = new Menu("Help");
		mn3.add(mnItem1);
		mn3.addSeparator();
		mn3.add(mnItem2);
		MenuBar mb = new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		mb.add(mn3);
		
		frame.setMenuBar(mb);
//		frame.setTitle("제목없음"); -> Frame 객체 생성 시 매개 인자에 넣어서도 가능.
		frame.setBounds(200,200,400,300);
		frame.setVisible(true);
		//메뉴는 프레임의 요소임
	}

}
