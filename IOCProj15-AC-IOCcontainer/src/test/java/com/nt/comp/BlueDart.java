//BlueDart.java(Dependent class)
package com.nt.comp;

public class BlueDart implements Courier {

	public BlueDart() {
		// TODO Auto-generated constructor stub
		System.out.println("BlueDart:: 0-param constructor");
	}
	
	@Override
	public String delivery(int oid) {
		// TODO Auto-generated method stub
		return oid + "order id order delivered by BlueDart";
	}

}
