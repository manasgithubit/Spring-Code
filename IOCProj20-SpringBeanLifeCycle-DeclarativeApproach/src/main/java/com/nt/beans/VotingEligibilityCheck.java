package com.nt.beans;

import java.util.Date;

public class VotingEligibilityCheck
{
   //bean properties
   private String name;
   private int age;
   private String address;
   private Date verfiedOn;
   
   public void setName(String name)
   {
    System.out.println("VotingEligibilityCheck.setName(-)");
    this.name = name;
   }
   public void setAge(int age)
   {
    System.out.println("VotingEligibilityCheck.setAge(-)");
    this.age = age;
   }
   public void setAddress(String address)
   {
    System.out.println("VotingEligibilityCheck.setAddress(-)");
    this.address = address;
   }
   
   //b.method
   public String checkVotingCriteria()
   {
      //b.logic
      if(age<18)
         return "Mr./Miss/Mrs." + name + " belongs to " + address + "is not elgible for voting --> verfied on::"+verfiedOn;
      else
         return "Mr./Miss/Mrs." + name + " belongs to " + address + "is elgible for voting --> verfied on::"+verfiedOn;
   }
}
