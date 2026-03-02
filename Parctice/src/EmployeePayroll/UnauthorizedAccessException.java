package EmployeePayroll;

public class UnauthorizedAccessException extends RuntimeException{
	
	public UnauthorizedAccessException(String msg) {
		super(msg);
	}
	
}	