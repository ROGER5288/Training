package Netflix;

public class User {
	
	private String name;
	private String email;
	private String dob;
	
	private Accounts accounts;
	private Subscription subscription;
	
	public User() {
		
	}
	public User(String name, String email, String dob,
			Subscription subscription, Accounts accounts) {
	this.name = name;
	this.email = email;
	this.dob = dob;
	this.subscription = subscription;
	this.accounts = accounts;
}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getDob() {
		return dob;
	}
	public Accounts getAccounts() {
		return accounts;
	}
	public Subscription getSubscription() {
		return subscription;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	public void userDetails() {
		System.out.println("Name : " + name + " Email-id : " + email + " DoB : " + dob);
		System.out.println("Subscription Details : " + subscription.getSubscriptionDetails());
		System.out.println( " User : " + accounts.showMovies());
	}
	

}
