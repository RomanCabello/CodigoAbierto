package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.SocketException;

import org.apache.commons.net.telnet.TelnetClient;

public class Brain {
	private TelnetClient TELNET = new TelnetClient();
	private BufferedReader in;
	private PrintStream out;
	private Listener listen;
	private Writer write;

	public Brain() {

		///////////////CONNECT///////////////////
		String Server = "route-server.he.net";

		try {
			TELNET.connect(Server, 23);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		////////////////////////////////////////

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
