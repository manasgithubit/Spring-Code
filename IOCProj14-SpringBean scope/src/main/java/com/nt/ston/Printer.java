//Printer.java(Singleton java class with minimum standards)
package com.nt.ston;

public class Printer {

	//static variable to hold reference of the single object
	private static Printer INSTANCE;
	private Printer() {
		// TODO Auto-generated method stub
        System.out.println("Printer::0-param constructor(private)");
	}
	
	//static factory method
	public static Printer getInstance() {
		// TODO Auto-generated method stub
        //singleton logic
		if(INSTANCE==null)
			 INSTANCE = new Printer();
		
		return INSTANCE;
	}
	
	//b.method
	public void print(String msg) {
		// TODO Auto-generated method stub
        System.out.println(msg);
	}
}
