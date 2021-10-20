/**
 * Valid Last Name with first letter starting with capital and has minimum 3 characters in it.
 *
 * @author: Navya Shree
 * @since: 20.10.2021
 */

package com.bridgelabz.ur.program;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println(lastName("Shree"));
		System.out.println(lastName("Sha"));
	}

	// validate last name
	public static boolean lastName(String lastName) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

}
