//DTDC.java(Dependent class1)
package com.nt.comp;

public class DTDC implements Courier {

	public DTDC() {
		// TODO Auto-generated constructor stub
		System.out.println("DTDC:: 0-param constructor");
	}
	
	
	
	@Override
	public String delivery(int oid) {
		// TODO Auto-generated method stub
		return oid + "order id order is delivered by DTDC";
	}

}
