import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException {
    Scanner scanner = new Scanner(new File("C:\\Users\\NADIA\\OneDrive\\Desktop\\java trainings notes\\java_projects\\Command\\src\\env.txt"));
    String className = scanner.nextLine();
    Class paymentClass = Class.forName(className);
    Payment payment = (Payment) paymentClass.newInstance();
    Command command = new Command("Iphone 13",6000, payment);
    command.getPaymentMode().pay();
    }
}
