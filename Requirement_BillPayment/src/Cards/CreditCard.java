package Cards;

import Interface.PaymentInterface;

public class CreditCard implements PaymentInterface {
    @Override
    public int ProcessPayment() {
        System.out.println();
        System.out.println("-------------Bill Payed Through Credit Card");
        return 2;
    }
}
