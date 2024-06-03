//Flipkart.java(Target class)
package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart
{
     //HAS-A property of type interface (Property should be Private)
    private Courier courier;
    
    public Flipkart()
    {
       System.out.println("Flipkart:: + 0-param constructor");
    }

    //Setter method for Setter Injection
    public void setCourier(Courier courier)
    {
     System.out.println("Flipkart.setCourier(-)");
     this.courier = courier;
    }
    
    //String Method
    public String shopping(String items[],float prices[])
    {
     //calculate billAmt
     float billAmt = 0.0f;
     for(int i = 0;i<items.length;i++)
         billAmt = billAmt+prices[i];
     //generate order id
     int oid = new Random().nextInt(100000);
     //use courier for shipping
     String status = courier.deliver(oid);
     String finalMsg = Arrays.toString(items)+"are purchsed with prices"+Arrays.toString(prices)+"The generated billAmount is::"+billAmt;
     
     return finalMsg+":::::"+status;
    }
}
