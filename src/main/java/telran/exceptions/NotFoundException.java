package telran.exceptions;

@SuppressWarnings("serial")
public class NotFoundException extends RuntimeException {
	/**
	 * Constructor
	 */
	public NotFoundException(String message) {
		super(message);
	}

}