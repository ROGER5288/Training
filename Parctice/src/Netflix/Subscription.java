package Netflix;


public class Subscription {
	private double amount;
	private String date;
	private int device;
	
	Subscription(){
		
	}
	
	Subscription(double amount, String date, int device){
		this.amount = amount;
		this.date = date;
		this.device = device;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getDate() {
		return date;
	}
	
	public int getDevice() {
		return device;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setDate(String date) {
		this.date = date;
	}	
	public void setDevice(int device) {
		this.device = device;
	}
	
	public String getSubscriptionDetails() {
		return "Amount of subscription : " +  amount + " End date : " + date + " number of device connected : " + device;
	}
	
}
