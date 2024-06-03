//Wish Message Generator
package com.nt.bean;

import java.util.Date;

public class WishMessageGenerator
{
    //HAS-A property(supporting composition)
        private Date date;
        
     // for construction injection
        public WishMessageGenerator(Date date)
        {
         System.out.println("WishMessageGenerator:1-param constructor");
         this.date = date;
        }
        
        public void setDate(Date date)
        {
             System.out.println("WishMessageGenerator:setDate(-)");
             this.date = date;
        }
}
