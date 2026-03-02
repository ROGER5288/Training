package Exception_Handling;

public class InvalidAmountException extends RuntimeException{
	public InvalidAmountException(String msg) {
		super(msg);
	}
}
