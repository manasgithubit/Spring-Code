//SportsCar.java
package com.nt.comp;

public class SportsCar extends Car {

	private String regNo;
	public SportsCar(String regNo) {
		System.out.println("SportsCar::1-param constructor");
		this.regNo = regNo;
	}
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub

	}

}
