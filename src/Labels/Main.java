package Labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		//Jlabel = a GUI display area for a string of text,an image or both
		
		ImageIcon image = new ImageIcon("dude.jpg");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel(); // creat a label 
		label.setText("hello world"); // set text of label 
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP);//Set TOP CENTER BOTTOM of imageicon
		label.setForeground(new Color(128,193,5));//set the color of font
		label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text
		label.setIconTextGap(-25); // set the gap of text to image 
		label.setBackground(Color.BLACK);// set background color 
		label.setOpaque(true);//display background color 
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text whitin label
		//label.setBounds(10,10,360,360);//set X,Y position within frame as wll as dimensions
		
		
		
		JFrame frame = new JFrame(); //creates a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out out the application by cliking on the X
		frame.setSize(500, 500); // sets the dimension of the frame 
		//frame.setLayout(null);
		frame.setVisible(true);// Makes visible 
		frame.add(label);
		frame.pack();//the last thing,will break the app if puts before adding all components 
		

		 
 }

}
