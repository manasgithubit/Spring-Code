package In.NIT;

import java.lang.reflect.Field;

public class Test
{
 public static void main(String[] args) throws Exception
 {
    //BillCollector bc = new BillCollector();
    //Injecting CreditCard Obj Into BillCollector (Setter Injection)
    //bc.setpayment(new CreditcardPayment());
    
  //Injecting CreditCard Obj Into BillCollector (Constructor Injection)
  //BillCollector bc1 = new BillCollector(new CreditcardPayment());
  // bc1.collectPayment(12200.00);
  // System.out.println();
  
  //CreditcardPayment ccd = new  CreditcardPayment();
    
    //Class<?> clz = Class.forName("In.NIT.BillCollector");
    
    //Object obj = clz.newInstance();
    
    //BillCollector bc = (BillCollector) obj;
    
    //Field field = clz.getDeclaredField("payment");
   // field.setAccessible(true);
    
   // field.set(obj, ccd);  //Injecting value to variable
   // bc.collectPayment(2000.00);
  
       //Dependent Class Obj
      CreditcardPayment cc = new CreditcardPayment();
      
      //Target Class Obj
      BillCollector bc = new BillCollector();
      
      //Injecting Dependent class obj to Target Class Obj
      bc.setpayment(cc);
      
      bc.collectPayment(400.00);
 }
}
