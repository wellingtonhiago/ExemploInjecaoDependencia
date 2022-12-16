public class ShoppingCart {
    private PaymentService paymentService;

    public ShoppingCart(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout(double totalPrice) {
        paymentService.processPayment(totalPrice);
    }
}
