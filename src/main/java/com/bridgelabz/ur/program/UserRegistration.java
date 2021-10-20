/**
 * Regular expression for Email validation.
 *
 * 
 * @author: Navya Shree
 * @since: 20.10.2021
 */

package com.bridgelabz.ur.program;

import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateEmail(String email) {
		return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
	}
}