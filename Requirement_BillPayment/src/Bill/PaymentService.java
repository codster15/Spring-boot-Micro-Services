package Bill;

import Cards.Sodex;
import Interface.PaymentInterface;

public class PaymentService {

   public PaymentInterface pay ;

   public PaymentService(PaymentInterface bill){
       this.pay = bill;

   }


   public void ProcessPayment(){
       int status = pay.ProcessPayment();

       if(status == 1){
           System.out.println("Payment Done with d-c");
       } else if (status == 2) {
           System.out.println("Payment Done with c-c");
       }else{
           System.out.println("Paydment Done with s-c");
       }


   }



}
