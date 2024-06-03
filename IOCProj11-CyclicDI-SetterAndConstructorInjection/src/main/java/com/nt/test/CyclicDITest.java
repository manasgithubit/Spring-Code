package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get Spring bean class obj(work)
		/*A oa = factory.getBean("a1",A.class);
		System.out.println(oa);*/
		
		B ob = factory.getBean("b1",B.class);
		System.out.println(ob);
	}

}
