package OOP.Abstraction;

class UPIPayment extends Payment {

    String upiApp;

    public UPIPayment(double amount, String upiApp) {
        super(amount);
        this.upiApp = upiApp;
    }

    @Override
    public void paymentInfo() {
    	System.out.println("Amount : " + amount);
        System.out.println("UPI App : " + upiApp);
    }

    @Override
    public void makePayment() {
        System.out.println("Payment is done using UPI");
    }
}