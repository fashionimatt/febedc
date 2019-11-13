package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex09 extends Frame{

	public Ex09(){
		Panel main = new Panel();
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		main.setLayout(layout);
		
		Button[] btns = new Button[10];
		for(int i=0; i<btns.length; i++){
			btns[i] = new Button(""+(i+1));
		}
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
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
		gbc.gridwidth = 4;
		layout.addLayoutComponent(btns[4], gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 3;
		layout.addLayoutComponent(btns[5], gbc);
		gbc.gridx=3;
		gbc.gridwidth=1;
		layout.addLayoutComponent(btns[6], gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridheight=2;
		layout.addLayoutComponent(btns[7], gbc);
		gbc.gridx=1;
		gbc.gridheight=1;
		gbc.gridwidth=3;
		layout.addLayoutComponent(btns[8], gbc);
		gbc.gridx=1;
		gbc.gridy=4;
		layout.addLayoutComponent(btns[9], gbc);
		
		
		for(int i=0; i<btns.length; i++){
			main.add(btns[i]);		
		}
		
		add(main);
		setBounds(200,200,400,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex09();
	}

}
