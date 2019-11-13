package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex10_1 extends Frame{
	
	public Ex10_1(){
		Panel main = new Panel();
		GridBagLayout layout = new GridBagLayout();
		main.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		String[][] txt ={
				{"Num Lock", "/", "*", "-"}, 
				{" 7 Home", "8", "9 Pg Up", "+"}, 
				{" 4", "5", "6"}, 
				{" 1 End", "2", "3 Pg Dn", "Enter"}, 
				{" 0 Ins",null,"       . Del"}
		};
	
		
		Button[][] btns = new Button[txt.length][];
		for(int i=0; i<txt.length; i++){
			btns[i] = new Button [txt[i].length];
			for(int j=0; j<txt[i].length; j++){
				if(txt[i][j]==null){
					btns[i][j]=null;
				}else{
					btns[i][j]=new Button(txt[i][j]);
				}
			}
		}
		
		for(int i=0; i<btns.length; i++){
			for(int j=0; j<btns[i].length; j++){
				if(btns[i][j]==null){continue;}
				gbc.gridx=j;
				gbc.gridy=i;
				if(j==3&&i==1||j==3&&i==3){
					gbc.gridheight=2;
				}else{
					gbc.gridheight=1;
				}
				if(i==4&&j==0){
					gbc.gridwidth=2;
				}else{
					gbc.gridwidth=1;
				}
				layout.addLayoutComponent(btns[i][j], gbc);
				main.add(btns[i][j]);
			}
		}
		add(main);
		setBounds(200,200,500,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex10_1();
	}

}
