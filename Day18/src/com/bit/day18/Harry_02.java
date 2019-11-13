package com.bit.day18;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

public class Harry_02 extends Frame {
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension dim = kit.getScreenSize();

	public Harry_02() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		

		setTitle("회원가입");
		setSize(300,500);
		setLocation((dim.width/2)-(this.getWidth()/2),(dim.height/2)-(this.getHeight()/2));
		setVisible(true);
	}
	
	

	private void setLocation(double d, double e) {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) {
		new Harry_02();
	}

}
