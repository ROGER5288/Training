package OOP.Abstraction;

public class Test {
    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCard(5000, "SBI");
        payment.paymentInfo();
        payment.makePayment();

        System.out.println();

        payment = new UPIPayment(2500, "GPay");
        payment.paymentInfo();
        payment.makePayment();
    }
}