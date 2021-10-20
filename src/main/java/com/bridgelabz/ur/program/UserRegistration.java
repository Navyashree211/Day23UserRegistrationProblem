/**
  * User need to follow pre-defiend Mobile Format .
 * Ex:-91 9919819801
 * country code follow by space and 10 digit number .
 * 
 * @author: Navya Shree
 * @since: 20.10.2021
 */

package com.bridgelabz.ur.program;

public class UserRegistration {

	public static void main(String[] args) {

		phoneNumber();
	}

	// validate given phone number
	public static void phoneNumber() {
		String phone = "91  9919819801";
		String regex = "[0-9]{2}[%s][0-9]{10}";
		boolean result = phone.matches(regex);
		if (result) {
			System.out.println("Given phone number is valid");
		} else {
			System.out.println("Given phone number is not valid ");
		}
	}
}
