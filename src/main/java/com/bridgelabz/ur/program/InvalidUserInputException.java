/**
 * Regular expression for Email validation.
 *
 * 
 * @author: Navya Shree
 * @since: 20.10.2021
 */

package com.bridgelabz.ur.program;

public class InvalidUserInputException extends Exception {
	enum ExceptionType {
		INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_PASSWORD, INVALID_PHONE_NUMBER, INVALID_EMAIL;
	}

	ExceptionType type;

	public InvalidUserInputException(ExceptionType type, String msg) {
		super(msg);
		this.type = type;
	}
}
