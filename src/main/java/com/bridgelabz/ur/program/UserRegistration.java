/**
 * Using Lambda Expression Validating first name, last name, email-id, phone number & Password.
 *
 * 
 * @author: Navya Shree
 * @since: 20.10.2021
 */

package com.bridgelabz.ur.program;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String NAME = "[A-Z][a-z]{2,}";
	private static final String EMAIL = "^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$";
	private static final String PHONE_NUMBER = "(0/91)?[7-9][0-9]{9}";
	private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

	static UserRegistrationInterfaces firstNameValidate = fName -> {
		boolean result = Pattern.matches(NAME, fName);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME,
					"Invalid Firsrt Name");
		}
	};

	static UserRegistrationInterfaces lastNameValidate = lName -> {
		boolean result = Pattern.matches(NAME, lName);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME,
					"Invalid Last Name");
		}
	};

	static UserRegistrationInterfaces emailValidate = email -> {
		boolean result = Pattern.matches(EMAIL, email);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_EMAIL, "Invalid Email");
		}
	};

	static UserRegistrationInterfaces phoneNumberValidate = phNum -> {
		boolean result = Pattern.matches(PHONE_NUMBER, phNum);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER,
					"Invalid Phone Number");
		}
	};

	static UserRegistrationInterfaces passwordValidate = pw -> {
		boolean result = Pattern.matches(PASSWORD, pw);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PASSWORD,
					"Invalid Password");
		}
	};

	public static void main(String[] args) throws InvalidUserInputException {

		UserRegistrationInterfaces fName = firstNameValidate;
		UserRegistrationInterfaces lName = lastNameValidate;
		UserRegistrationInterfaces email = emailValidate;
		UserRegistrationInterfaces mobile = phoneNumberValidate;
		UserRegistrationInterfaces password = passwordValidate;

		System.out.println("First Name: " + fName.userEntries("Navaya"));
		System.out.println("Last Name:  " + lName.userEntries("Shree"));
		System.out.println("Email:      " + email.userEntries("abc@yahoo.com"));
		System.out.println("Phone Number:" + mobile.userEntries("9800088899"));
		System.out.println("Password: " + password.userEntries("Navyas15@"));

	}
}