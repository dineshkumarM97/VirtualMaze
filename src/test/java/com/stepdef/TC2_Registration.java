package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.LoginPage;
import com.pages.RegistrationPage;
import com.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_Registration extends BaseClass {

	LoginPage login = new LoginPage();
	RegistrationPage rp = new RegistrationPage();

	@Given("User is on the registration page")
	public void user_is_on_the_registration_page() {

	}

	@When("User fills in valid registration details {string},{string},{string},{string} and {string}")
	public void user_fills_in_valid_registration_details_and(String firstname, String email, String mobile,
			String password, String cnfmPsw) {
		btnClick(login.getRegisterHere());
		rp.fillRegistrationDetails(firstname, email, mobile, password, cnfmPsw);

	}

	@When("User clicks on register button")
	public void user_clicks_on_register_button() {
		rp.clickRegistration();

	}

	@Then("User should receive a confirmation email")
	public void user_should_receive_a_confirmation_email() {

	}

	@Then("User should be redirected to the login page")
	public void user_should_be_redirected_to_the_login_page() {

	}

	@Then("User should verify the already existing email message {string}")
	public void user_should_verify_the_already_existing_email_message(String string) {
		WebElement alreadyUser = rp.getAlreadyUser();
		String text = alreadyUser.getText();
		System.out.println(text);
		Assert.assertEquals(string, text);
		if (string.equals(text)) {
			rp.clkAlreadyuser();
		}

	}

	@When("User fills in invalid registration details {string},{string},{string},{string} and {string}")
	public void user_fills_in_invalid_registration_details_and(String firstname, String email, String mobile,
			String password, String cnfmPsw) {
		btnClick(login.getRegisterHere());
		rp.fillRegistrationDetails(firstname, email, mobile, password, cnfmPsw);
	}

	@Then("User should verify the error message {string}")
	public void user_should_verify_the_error_message(String string) {
		WebElement invalidParaMsg = rp.getInvalidParaMsg();
		String text = invalidParaMsg.getText();
		System.out.println(text);
		Assert.assertEquals(string, text);

	}

}
