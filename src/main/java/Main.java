import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaypalPaymentService Paypal = new PaypalPaymentService();
        CreditCardPaymentService CreditCard = new CreditCardPaymentService();

        List<ShoppingCart> myCarts = new ArrayList<>();

        myCarts.add(new ShoppingCart(Paypal));
        myCarts.add(new ShoppingCart(CreditCard));
    }
}
