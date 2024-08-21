package In.NIT;

public class BillCollector
{
     private IPayments payment;
     
     //Using setter method  = why using setter method - to set the value for variable of payment
     //using object by injecting     setter method 
     public void setpayment(IPayments payment)
     {
           this.payment = payment;
     }
     
     public BillCollector()
     {
           
     }
     
     public BillCollector(IPayments payment)
     {
          this.payment = payment;
     }
     public void collectPayment(double amount)
     {
         String start = payment.pay(amount);
         System.out.println(start);
     }
}
