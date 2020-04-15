package main;

import javax.swing.*;

public class Main {
	
	private static Brain brain = new Brain();
	private static SQ sq;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sq = new SQ(brain);
		
		
		JFrame f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("click");//creating instance of JButton
		b.addActionListener(sq);
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		
		JTextField field = new JTextField();
		field.setBounds(10, 50, 300, 30);
		          
		f.add(b);//adding button in JFrame  
		f.add(field);
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}

}
