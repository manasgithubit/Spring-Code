package com.nt.comp;

public class Test
{
      private int a = 10;
      private String b = "manas";
      
     
      public Test(int a,String b)
      {
           this.a = a;
           this.b = b;
           System.out.println("Test::1-param constructor");
      }
         public Test()
          {
               System.out.println("Test::0-param constructor");
          }
      
      //Using toString Method(ALT + shift + s,s)
      @Override
      public String toString()
      {
       return "Test [a=" + a + ", b=" + b + "]";
      }
}









