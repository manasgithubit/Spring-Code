package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingEligibilityCheck;

public class BeanLifeCycleTest1
{

 public static void main(String[] args)
  {
     //create BeanFactory IOC container
     DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
     XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
     reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
     
     //get spring bean class obj
     VotingEligibilityCheck voting = factory.getBean("voting",VotingEligibilityCheck.class);
     //invoke the b.method
     System.out.println(voting.checkVotingCriteria());
     

     
  }
 
}
