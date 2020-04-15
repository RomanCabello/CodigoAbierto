package main;

import java.io.BufferedReader;
import java.io.IOException;

public class Listener extends Thread{
	
	private boolean flag;
	private BufferedReader in;
	private Brain brain;
	
	public Listener(Brain brain)
	{
		this.brain = brain;
		flag = true;
		this.in = brain.getIn();
	}
	
	public void run()
	{
		String line = null;
		try {
			line = in.readLine();
		while(flag)
		{
			
				
				System.out.println(line);
				line = in.readLine();
			
			
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void terminate()
	{
		flag = false;
	}

}
