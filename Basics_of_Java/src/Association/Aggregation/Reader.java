package Association.Aggregation;

// For Commentout codes done by me of Library and Book

public class Reader {
	public static void main(String[] args) {
	     
		Library library=new Library();
		library.setAddress("New York City");
		library.setLocation("890 Fifth Avenue, Manhattan");
		library.setName("Tony Stark");
//		library.setPinCode("NY 10021");
		System.out.println("Reader Name: " + library.getName());
		System.out.println("Address: " + library.getAddress());
		System.out.println("Location: " + library.getLocation());
//	    System.out.println("PinCode: " +library.getPinCode());

		System.out.println("Library "+library.getBook());
	     
		library.addBookArray(2);
		library.addBook("1","Harry Potter","J.K. Rowling", "7669.00");
		library.addBook("2","Harry Potter","J.K. Rowling", "7669.00");
		library.addBook("3","Harry Potter","J.K. Rowling", "7669.00");

//		library.applyBook("1","Harry Potter","J.K. Rowling", "7669.00");
		for (Book b : library.getBook()) {
			if (b != null) {
				System.out.println(b.getDetails());
			}
		}
		
//		System.out.println("Book_Id: " +library.getBook().getId());
//		System.out.println("Author: " +library.getBook().getAuthor());
//		System.out.println("Title: " +library.getBook().getTitle());
//		System.out.println("Price: " +library.getBook().getPrice());
	}
}