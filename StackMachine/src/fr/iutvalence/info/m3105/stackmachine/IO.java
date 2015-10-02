package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public interface IO {

	public void displayRuntimeError(String string)
	{
		System.err.println(string);
		
	}
	
	public void displayProgramTermination()
	{
		System.out.println("(HALT)");
	}

	public int read() throws IOException
	{
		this.out.print("? ");
		String line = this.in.readLine();
		this.out.println();
		return Integer.parseInt(line);
		
	}

	public void write(int op)
	{
		this.out.println("> "+op);
		
	}
}