package telran.students.exceptions;

import telran.students.service.ServiceErrorMessages;

@SuppressWarnings("serial")
public class StudentIllegalStateException extends IllegalStateException {

	/**
	 * Constructor
	 */
	public StudentIllegalStateException() {
		super(ServiceErrorMessages.STUDENT_ALREADY_EXISTS);
	}

}