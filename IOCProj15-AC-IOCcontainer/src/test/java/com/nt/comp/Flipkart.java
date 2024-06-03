//Flipkart.java(target class)
package com.nt.comp;


import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	//HAS-A property of type interface
	private Courier courier;
	
	
	public Flipkart() {
		// TODO Auto-generated constructor stub
		System.out.println("Flipkart::0-param constructor");
	}
	
	//setter method for setter injection
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier = courier;
	}	
	
	public String shopping(String items[],float price[]) {
		// TODO Auto-generated method stub
        //calculate billAmt
		float billAmt = 0.0f;
		for(int i = 0; i<items.length; i++)
			billAmt = billAmt + price[i];
		//generate order id
		int oid = new Random().nextInt(100000);
		//use courier for shopping
		String statuS = courier.delivery(oid);
		String finalMsg = Arrays.toString(items) + "are purchsed with prices" + Arrays.toString(price) + ". The generated billAmount is :: " + billAmt; 
		return finalMsg + ":::" + statuS;	
	}
}
