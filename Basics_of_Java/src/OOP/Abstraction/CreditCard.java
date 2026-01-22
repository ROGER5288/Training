package OOP.Abstraction;

class CreditCard extends Payment {

    String creditCompany;

    public CreditCard(double amount, String creditCompany) {
        super(amount);
        this.creditCompany = creditCompany;
    }

    @Override
    public void paymentInfo() {
    	System.out.println("Amount : " + amount);
        System.out.println("Company : " + creditCompany);
    }

    @Override
    public void makePayment() {
        System.out.println("Payment is done using Credit Card");
    }
}