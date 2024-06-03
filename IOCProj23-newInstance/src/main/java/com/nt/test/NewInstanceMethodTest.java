package com.nt.test;

public class NewInstanceMethodTest
{

 public static void main(String[] args) throws Exception
 {
  // Load Class
       Class c1 = Class.forName(args[0]);
       Class c2 = Class.forName(args[1]);
       
       //Create the object loaded classes
       Object obj1 = c1.newInstance();
       Object obj2 = c2.newInstance();
       
       System.out.println(obj1.toString());
       System.out.println(obj2.toString());
 }

}
