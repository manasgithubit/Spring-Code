//StrategyDPTest.java
package com.nt.Test;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class StrategyDPTest2 {


	public static void main(String[] args) {
		
       DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
       XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
       reader.loadBeanDefinitions("applicationContext.xml");
       
       System.out.println("BF container created");
        /*	//get target class object
        	Flipkart fpkt = factory.getBean("fpkt",Flipkart.class);
        	//invoke the b.method
        	String resultMsg = fpkt.shopping(new String[] {"shirt","trouser","mobile"},
        			                          new float[]{3400.0f,5600.0f,6000.0f});
        	System.out.println(resultMsg);
        	*/
        	
        	
	}//main
}//class
