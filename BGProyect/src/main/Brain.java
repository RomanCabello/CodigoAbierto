package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.SocketException;
import java.util.ArrayList;

import javax.swing.JTextField;

import org.apache.commons.net.telnet.TelnetClient;

public class Brain {
	private TelnetClient TELNET = new TelnetClient();
	private BufferedReader in;
	private PrintStream out;
	private Listener listen;
	private Writer write;
	private JTextField server;
	private ArrayList<String>neighbors = new ArrayList<String>();

	public ArrayList<String> getNeighbors() {
		return neighbors;
	}
	
	public void nclear()
	{
		neighbors.clear();
	}

	public void addNeighbor(String neighbor) {
		neighbors.add(neighbor);
		System.out.println("Neighbor "+ neighbor+" added");
	}

	public JTextField getServer() {
		return server;
	}

	public void setServer(JTextField server) {
		this.server = server;
	}

	public Brain() {


	}
	
	public void codeset(int code)
	{
		listen.setCode(code);
	}
	
	public void conection(String Server)
	{
		try {
			TELNET.connect(Server, 23);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Connected");
		
		in = new BufferedReader(new InputStreamReader(TELNET.getInputStream()));
		out = new PrintStream(TELNET.getOutputStream());
		listen = new Listener(this);
		listen.start();
		
		write = new Writer(this);
		
	}
	
	
	
	public void submit(String value)
	{
		write.write(value);
	}
	
	public void stahp()
	{
		write.write("end");
	}
	
	

	public BufferedReader getIn() {
		return in;
	}

	public void setIn(BufferedReader in) {
		this.in = in;
	}

	public PrintStream getOut() {
		return out;
	}

	public void setOut(PrintStream out) {
		this.out = out;
	}

}
