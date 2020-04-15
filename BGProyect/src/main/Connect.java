package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Connect implements ActionListener{
	private Brain brain;
	private JTextField server;
	
	public Connect(Brain brain, JTextField server)
	{
		this.brain = brain;
		this.server = server;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		brain.conection(server.getText());
	}

}
