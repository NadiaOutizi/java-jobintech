public class Transfer implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment by transfer");
    }
}
