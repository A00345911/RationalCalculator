
package exceptions;

public class DivisionByZeroException extends Exception{

	String message;
	
	public DivisionByZeroException(String message) {
		super(message);
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
}
