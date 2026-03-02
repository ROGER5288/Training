import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;



public class test_employee {
	public static void main(String [] args) {
		 Employee[] employees = {

		            new Employee(105, "Arjun Kumar", "arjun@gmail.com", 9876543210L, "Male",
		                    LocalDate.of(1995, 5, 21), LocalTime.of(10, 30), 45000),

		            new Employee(102, "Priya Sharma", "priya@gmail.com", 9123456780L, "Female",
		                    LocalDate.of(1998, 8, 15), LocalTime.of(14, 45), 52000),

		            new Employee(109, "Rahul Verma", "rahul@gmail.com", 9988776655L, "Male",
		                    LocalDate.of(1993, 3, 10), LocalTime.of(9, 15), 60000),

		            new Employee(101, "Sneha Reddy", "sneha@gmail.com", 9090909090L, "Female",
		                    LocalDate.of(1997, 11, 2), LocalTime.of(16, 20), 48000),

		            new Employee(108, "Kiran Patel", "kiran@gmail.com", 9012345678L, "Male",
		                    LocalDate.of(1992, 1, 30), LocalTime.of(8, 50), 75000),

		            new Employee(103, "Anjali Mehta", "anjali@gmail.com", 9345678123L, "Female",
		                    LocalDate.of(1996, 6, 18), LocalTime.of(12, 10), 53000),

		            new Employee(110, "Vikram Singh", "vikram@gmail.com", 9871234560L, "Male",
		                    LocalDate.of(1994, 9, 25), LocalTime.of(18, 5), 67000),

		            new Employee(104, "Neha Gupta", "neha@gmail.com", 9765432109L, "Female",
		                    LocalDate.of(1999, 12, 12), LocalTime.of(7, 40), 40000),

		            new Employee(107, "Rohan Das", "rohan@gmail.com", 9881122334L, "Male",
		                    LocalDate.of(1991, 4, 5), LocalTime.of(20, 25), 82000),

		            new Employee(106, "Divya Nair", "divya@gmail.com", 9556677889L, "Female",
		                    LocalDate.of(1995, 7, 9), LocalTime.of(11, 55), 59000)
		        };
		 
		 Employee.NameComparator nameComparator = new Employee.NameComparator();
		 
		 Comparator<Employee> DateofBirthComparator = new Comparator<Employee>() {
				@Override
				public int compare(Employee e1, Employee e2 ) {
					return e1.getDateofBirth().compareTo(e2.getDateofBirth());
							
				}
				
		 };
		 
		 Arrays.sort(employees, DateofBirthComparator);
		 for (Employee e : employees) {
	            System.out.println(e);
	            System.out.println("");
	     }
	}
}
