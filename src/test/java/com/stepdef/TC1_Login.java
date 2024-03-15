package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.DashBoard;
import com.pages.LoginPage;
import com.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_Login {

	LoginPage login = new LoginPage();
	DashBoard db = new DashBoard();
	RegistrationPage rp = new RegistrationPage();

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {

	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {

		login.loginMethod(username, password);

	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		login.btnLogin();

	}

	@Then("User should verify the login success message {string}")
	public void user_should_verify_the_login_success_message(String expected) {
		WebElement succesMsg = db.getSuccesMsg();
		String text = succesMsg.getText();
		Assert.assertEquals(expected, text);

	}

	@When("User enters invalid {string} and {string}")
	public void user_enters_invalid_and(String username, String password) {
		login.loginMethod(username, password);
		login.btnLogin();
	}

	@Then("User should verify an error message {string}")
	public void user_should_verify_an_error_message(String string) {
		WebElement txtErrorMsg = login.getTxtErrorMsg();
		String text = txtErrorMsg.getText();
		Assert.assertEquals(string, text);
	}

	@When("User clicks on the registration link")
	public void user_clicks_on_the_registration_link() {
		login.navigateRegistration();

	}

	@Then("User should be redirected to the registration page")
	public void user_should_be_redirected_to_the_registration_page() {

		WebElement signUpEnable = rp.getSignUpEnable();
	//	boolean selected = signUpEnable.isSelected();
		boolean enabled = signUpEnable.isEnabled();
		System.out.println(enabled);
		Assert.assertTrue(enabled);

	}

}
