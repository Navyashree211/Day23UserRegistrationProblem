/**
* Functional interface for UserRegistration.
* 
* @author : Navya Shree
* @since : 20-10-21
*/
package com.bridgelabz.ur.program;

@FunctionalInterface
public interface UserRegistrationInterfaces {
	public boolean userEntries(String value) throws InvalidUserInputException;
}
