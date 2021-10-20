/**
 * Validating first name, last name, email-id, phone number & Password.
 *
 * 
 * @author: Navya Shree
 * @since: 20.10.2021
 */

package com.bridgelabz.ur.test.programs;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.ur.program.UserRegistration;

public class UserRegistrationRegExTest {

	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.firstNameValidate("Chaitra");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.firstNameValidate("C");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.lastNameValidate("Sherikar");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.lastNameValidate("cns");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhone_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.phoneNumberValidate("91 9863632323");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhone_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.phoneNumberValidate("9198323723");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.passwordValidate("Jhjsh23#%");
		Assert.assertFalse(result);
	}

}
