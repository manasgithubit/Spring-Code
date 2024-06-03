package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructionInjectionTest2
{
     public static void main(String[] args)
     {
              //create IOC container(BeanFactory container)
                DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
                XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
                reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
             // XmlBeanFactory factory = new XmlBeanFactory(res);
              //get Target spring bean class object
              WishMessageGenerator generator = factory.getBean("wmg",WishMessageGenerator.class);
              //invoke the b.method
              String result = generator.generateMessage("manas");
              System.out.println("Wish Message is::" + result);
     }
}
