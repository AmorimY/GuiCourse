package Frame;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame(){
		this.setTitle("Jthis title goes here");//set the title of the frame 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out out the application by cliking on the X
		this.setResizable(false);//prevent frame from being resized 
		this.setSize(420, 420); // sets the dimension of the frame 
		this.setVisible(true);// Makes visible 
		ImageIcon image = new ImageIcon("logo.png");//create a image icon
		this.setIconImage(image.getImage());//change the icon of the frame
		this.getContentPane().setBackground(new Color(34,77,31)); //Change color of background 
	}

}
