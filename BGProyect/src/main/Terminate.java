package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Terminate implements ActionListener{
	
	private Brain brain;
	
	public Terminate(Brain brain)
	{
		this.brain = brain;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		brain.nuke();
		System.exit(0);
	}

}
