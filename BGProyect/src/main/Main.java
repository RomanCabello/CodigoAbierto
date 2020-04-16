package main;

import javax.swing.*;

public class Main {
	
	private static Brain brain = new Brain();
	private static SQ sq;
	private static Connect con;
	private static Terminate ter;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		sq = new SQ(brain);
		ter = new Terminate(brain);
		
		
		JFrame f=new JFrame();//creating instance of JFrame  
		
		
		
		JTextField field = new JTextField();
		field.setBounds(10, 50, 300, 30);
		
        
		JButton b=new JButton("show bgp ipv4 unicast");//creating instance of JButton
		b.addActionListener(sq);
		b.setBounds(10,100,100, 40);//x axis, y axis, width, height 
		
		con = new Connect(brain,field);
		
		JButton connect = new JButton("connect");
		connect.addActionListener(con);
		connect.setBounds(130,100,100, 40);
		
		
		JButton terminate = new JButton("Terminate");
		terminate.addActionListener(ter);
		terminate.setBounds(250,100,100,40);
		
		
		
		brain.setServer(field);
		          
		f.add(b);//adding button in JFrame 
		f.add(connect);
		f.add(field);
		f.add(terminate);
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}

}
