package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex10 extends Frame{
	
	public Ex10(){
		Panel main = new Panel();
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		main.setLayout(layout);
		Button[] btns = new Button[17];
		String[] txt = {"Num Lock", "/", "*", "-", "7 Home", 
				"8", "9 Pg Up", "+", "4", "5", "6", "1 End", 
				"2", "3 Pg Dn", "Enter", "0 Ins", "       . Del"};
		for(int i=0; i<btns.length; i++){
			Button temp = new Button(txt[i]);
			btns[i] = temp;
			main.add(btns[i]);
		}
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		layout.addLayoutComponent(btns[0], gbc);
		gbc.gridx = 1;
		layout.addLayoutComponent(btns[1], gbc);
		gbc.gridx = 2;
		layout.addLayoutComponent(btns[2], gbc);
		gbc.gridx = 3;
		layout.addLayoutComponent(btns[3], gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		layout.addLayoutComponent(btns[4], gbc);
		gbc.gridx = 1;
		layout.addLayoutComponent(btns[5], gbc);
		gbc.gridx = 2;
		layout.addLayoutComponent(btns[6], gbc);
		gbc.gridx = 3;
		gbc.gridheight = 2;
		layout.addLayoutComponent(btns[7], gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		layout.addLayoutComponent(btns[8], gbc);
		gbc.gridx = 1;
		layout.addLayoutComponent(btns[9], gbc);
		gbc.gridx = 2;
		layout.addLayoutComponent(btns[10], gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		layout.addLayoutComponent(btns[11], gbc);
		gbc.gridx = 1;
		layout.addLayoutComponent(btns[12], gbc);
		gbc.gridx = 2;
		layout.addLayoutComponent(btns[13], gbc);
		gbc.gridx = 3;
		gbc.gridheight = 2;
		layout.addLayoutComponent(btns[14], gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		layout.addLayoutComponent(btns[15], gbc);
		gbc.gridx = 1;
		layout.addLayoutComponent(btns[16], gbc);
		
		add(main);
		setBounds(200,200,500,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex10();
	}

}
