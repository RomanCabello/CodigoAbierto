package main;

import java.io.BufferedReader;
import java.io.IOException;

public class Listener extends Thread{
	
	private boolean flag;
	private BufferedReader in;
	private Brain brain;
	private int code;
	private boolean found;
	
	

	public Listener(Brain brain)
	{
		this.brain = brain;
		flag = true;
		this.in = brain.getIn();
		code = 0;
		found = true;
	}
	
	public void run()
	{
		String line = null;
		try {
			line = in.readLine();
		while(flag)
		{
			
				
				if (code == 0) {
					System.out.println(line);
				}if(code==1)
				{
						System.out.println(line);

				}
				line = in.readLine();
			
			
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	public void terminate()
	{
		flag = false;
	}

}
