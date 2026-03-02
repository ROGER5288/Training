
public class Customer {
	int networth;
	String name;
	
	Customer(){
		
	}
	Customer(int networth, String name){
		this.name = name;
		this.networth =networth;
	}
	
	public int getNetworth() {
		return networth;
	}
	public void setNetworth(int networth) {
		this.networth = networth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString () {
		return "Customer Details: " + "\n"+ " Name : " +  name  + "\n"+" Networth : " +networth;
	}
}
