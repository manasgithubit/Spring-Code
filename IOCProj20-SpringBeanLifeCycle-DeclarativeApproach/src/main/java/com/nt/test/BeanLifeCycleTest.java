package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingEligibilityCheck;

public class BeanLifeCycleTest
{

 public static void main(String[] args)
  {
     //create IOC container
     ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
     //get spring bean class obj
     VotingEligibilityCheck voting = ctx.getBean("voting",VotingEligibilityCheck.class);
     //invoke the b.method
     System.out.println(voting.checkVotingCriteria());
     
     //close IOC container
     ctx.close();
     
  }
 
}
