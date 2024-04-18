public class Command{
    private String product;
    private double price;
    private Payment paymentMode;

    public Command(String product, double price, Payment paymentMode) {
        this.product = product;
        this.price = price;
        this.paymentMode = paymentMode;
    }

    public Payment getPaymentMode() {
        return paymentMode;
    }
}
