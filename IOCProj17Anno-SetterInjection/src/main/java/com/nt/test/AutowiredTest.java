package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class AutowiredTest {

	public static void main(String[] args) {
        //create IOC container
	    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	    //get bean spring bean class obj
	    WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String result = generator.generateMessage("manas");
		System.out.println("Wish Message is ::" + result);
		
		//close the IOC container
		ctx.close();
		
	}//main
}//class
