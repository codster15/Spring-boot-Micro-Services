import Bill.PaymentService;
import Cards.Sodex;
import Cards.debitCard;
import Interface.PaymentInterface;

public class Payment_Application {
    public static void main(String[] args) {

        PaymentInterface pd = new debitCard();

        PaymentService pb = new PaymentService(pd);

        pb.ProcessPayment();

    }
}
