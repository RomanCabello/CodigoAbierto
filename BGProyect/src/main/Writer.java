package main;

import java.io.PrintStream;

public class Writer{
	private Brain brain;
	private PrintStream out;
	
	public Writer(Brain brain)
	{
		this.brain = brain;
		this.out = brain.getOut();
	}
	
	public void run()
	{
		
	}
	
	public void write(String value)
	{
		try {
            out.println(value);
            out.flush();
            //System.out.println(value);
        } catch (Exception e) {
            System.err.println("write exception: "+e.toString());
        }
	}
	
}
