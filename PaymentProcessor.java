
public class PaymentProcessor {
private static final double MAX_PAYMENT_LIMIT = 1000.0;
public void processPayment(double amount) throws InsufficientFundsException {
    if(amount>MAX_PAYMENT_LIMIT){
        throw new InsufficientFundsException("InsufficientFundsException caught and handled.");
    }

}
public static void main(String[] args) {
PaymentProcessor processor = new PaymentProcessor();
try {
processor.processPayment (500.0);
System.out.println("Payment 1: Successfully processed.");
} catch (InsufficientFundsException e) {
System.out.println("Payment 1: Error - "+ e.getMessage());
}
try {
processor.processPayment(1200.0);
System.out.println("Payment 2: Successfully processed.");
} catch (InsufficientFundsException e) {
System.out.println("Payment 2: Error - "+ e.getMessage());
}
}
}