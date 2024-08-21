package In.NIT;

public class DebitCardPayment implements IPayments
{

 @Override
 public String pay(double amount)
 {
    //Logic For Debit Card Payment 
    return "Payment Successful for through Debit Card";
 }

}
