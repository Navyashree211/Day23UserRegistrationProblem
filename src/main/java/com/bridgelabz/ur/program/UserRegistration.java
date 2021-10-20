/**
 * Valid First Name with first letter starting with capital and has minimum 3 characters in it.
 *
 * @author: Navya Shree
 * @since: 20.10.2021
 */

package com.bridgelabz.ur.program;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println(firstName("Navya"));
		System.out.println(firstName("Anokhi"));
	}

	// validate first name
	public static boolean firstName(String FirstName) {
		return FirstName.matches("^[A-Z]{1}[a-z]{2,}$");

	}
}
