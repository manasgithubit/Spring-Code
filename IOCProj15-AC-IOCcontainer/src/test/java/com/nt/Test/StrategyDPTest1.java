//StrategyDPTest.java
package com.nt.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class StrategyDPTest1 {


	public static void main(String[] args) {
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
        	//get target class object
        	Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
        	//invoke the b.method
        	String resultMsg = fpkt.shopping(new String[] {"shirt","trouser","mobile"},
        			                          new float[]{3400.0f,5600.0f,6000.0f});
        	System.out.println(resultMsg);
        	
        	//close container
        	ctx.close();
	}//main
}//class
