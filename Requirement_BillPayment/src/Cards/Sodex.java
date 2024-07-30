package Cards;

import Interface.PaymentInterface;

public class Sodex implements PaymentInterface {
    @Override
    public int ProcessPayment() {
        System.out.println();
        System.out.println("-------------------Bill Payed Through Sodex Card");
        return 3;
    }
}
