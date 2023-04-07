package Buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame  extends JFrame implements ActionListener{
	JButton button ;
	JLabel label;

	MyFrame(){
		
		ImageIcon icon = new ImageIcon("thumbs.png");
		
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);//the way of adding action listeners through implementation
		//button.addActionListener(e ->System.out.println("hello"));//the way use lambda
		button.setText("I'am a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-9);
		button.setForeground(Color.cyan);	
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false);//disable the button
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	//this override wont be necessary if using lambda
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("Hello");
			label.setVisible(true);//shows the label when clicked 
			
		}
	}

}
