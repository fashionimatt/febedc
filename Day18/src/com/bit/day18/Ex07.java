package com.bit.day18;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex07 extends Frame{
	Panel main = new Panel();

	public Ex07() {
		 GridBagLayout gridbag = new GridBagLayout();
         GridBagConstraints c = new GridBagConstraints();

         setFont(new Font("SansSerif", Font.PLAIN, 14));
         main.setLayout(gridbag);

         c.fill = GridBagConstraints.BOTH;
         c.weightx = 1.0;
         makebutton("Button1", gridbag, c);
         makebutton("Button2", gridbag, c);
         makebutton("Button3", gridbag, c);

         c.gridwidth = GridBagConstraints.REMAINDER; //end row
         makebutton("Button4", gridbag, c);

         c.weightx = 0.0;                //reset to the default
         makebutton("Button5", gridbag, c); //another row

         c.gridwidth = GridBagConstraints.RELATIVE; //next-to-last in row
         makebutton("Button6", gridbag, c);

         c.gridwidth = GridBagConstraints.REMAINDER; //end row
         makebutton("Button7", gridbag, c);

         c.gridwidth = 1;                //reset to the default
         c.gridheight = 2;
         c.weighty = 1.0;
         makebutton("Button8", gridbag, c);

         c.weighty = 0.0;                //reset to the default
         c.gridwidth = GridBagConstraints.REMAINDER; //end row
         c.gridheight = 1;               //reset to the default
         makebutton("Button9", gridbag, c);
         makebutton("Button10", gridbag, c);

        
        add(main);
        setSize(300, 100);
		setLocation(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex07();
		
	}
	
	protected void makebutton(String name,GridBagLayout gridbag,GridBagConstraints c) {
		Button button = new Button(name);
		gridbag.setConstraints(button, c);
		main.add(button);
	}

}
