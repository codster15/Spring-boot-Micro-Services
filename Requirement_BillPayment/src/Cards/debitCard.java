package Cards;

import Interface.PaymentInterface;

public class debitCard  implements PaymentInterface {

    @Override
    public int ProcessPayment() {
        System.out.println();
        System.out.println("--------------------Bill Payed Through Debit Card");
        return 1;
    }
}
