package Association.Aggregation;

public class User {
	public static void main(String[] args) {
	     
		Person person=new Person();
		person.setAge("20");
		person.setGender("Male");
		person.setName("Miller");
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
	    

		System.out.println("passport "+person.getPassport());
	     
		person.applyPassport("1","15/09/2004","01-01-2030");
		
		System.out.println("passport "+person.getPassport());
		
		System.out.println(person.getPassport().getId());
		System.out.println(person.getPassport().getDob());
		System.out.println(person.getPassport().getExpDate());
	}
}
