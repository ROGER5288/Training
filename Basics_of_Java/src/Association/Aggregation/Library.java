package Association.Aggregation;
public class Library {

	private String name;
	private String location;
	private String address;
	private String pincode;
	
	private Book[] book;
	
	
	private int index = 0; // to track added books

	// create book array
	public Book[] addBookArray(int size) {
		return book = new Book[size];
	}

	// add single book into array
	public void addBook(String id, String title, String author, String price) {
		if (index < book.length) {
			book[index++] = new Book(id, title, author, price);
		} else {
			System.out.println("Library is full, cannot add more books");
		}
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getAddress() {
		return address;
	}

	public String getPincode() {
		return pincode;
	}

	public Book[] getBook() {
		return book;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}
	
	public String getLibraryDetials() {
		return "Name "+name+" Location "+location+" Address "+address+" Pincode : "+pincode; 
	}

	public Book[] addBook(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book[] addBook1(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}



//public class Library {
//
//	private String name;//null
//	private String location;//null
//	private String address;//null
//	private String pincode;
//	
//	private Book book;//null
//	
//	public void applyBook() {
//		
//	}
//	public void applyBook(String id, String title, String author, String price) {
//	    book = new Book(id, title, author, price);
//	}
//
//	public String getName() {
//		return name;
//	}
//	
//	public String getLocation() {
//		return location;
//	}
//	
//	public String getAddress() {
//		return address;
//	}
//	
//	public String getPinCode() {
//		return pincode;
//	}
//	
//	public Book getBook() {
//		return book;
//	}
//	
//	public void setName(String name) {
//		this.name=name;
//	}
//	
//	public void setLocation(String location) {
//		this.location=location;
//	}
//	
//	public void setAddress(String address) {
//		this.address=address;
//	}
//	
//	public void setPinCode(String pincode) {
//		this.pincode=pincode;
//	}
//}



