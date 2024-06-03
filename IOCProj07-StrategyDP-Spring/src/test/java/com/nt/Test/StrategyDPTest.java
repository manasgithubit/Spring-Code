//StrategyDPTest.java
package com.nt.Test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	//get target class object from factory
        	Flipkart fpkt = FlipkartFactory.createFlipkart("bDart");
        	//invoke the b.method
        	String result = fpkt.shopping(new String[] {"shirt","trouser","mobile"},
        			                          new float[]{3400.0f,5600.0f,6000.0f});
        	System.out.println(result);
        }//try
        catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
	}//main
}//class
