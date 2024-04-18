public class Cash implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment by cash");
    }
}
