package EmployeePayroll;

public abstract class Employee implements Payroll{
	
	private  Integer id;
	private String name;
	private String role;
	private Double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(Integer id, String name, String role, Double salary) throws InvalidSalaryException {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		setSalary(role, salary);
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(String role ,Double salary) throws InvalidSalaryException {
		
		if(!role.equalsIgnoreCase("HR")) {
			throw new UnauthorizedAccessException("Only Hr can update the salary");
		}
		
		if(salary < 0) {
			throw new InvalidSalaryException("salary cannot be less than zero");
		}
		
		this.salary = salary;
	}	
}

