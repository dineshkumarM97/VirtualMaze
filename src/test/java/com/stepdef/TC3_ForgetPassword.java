package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.ForgetPasswordPage;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_ForgetPassword {

	LoginPage login = new LoginPage();
	ForgetPasswordPage fp = new ForgetPasswordPage();

	@Given("User is on the forgot password page")
	public void user_is_on_the_forgot_password_page() {

	}

	@When("User enters their email address {string}")
	public void user_enters_their_email_address(String email) {
		login.clkForgetPassword(email);

	}

	@When("User clicks on reset password button")
	public void user_clicks_on_reset_password_button() {
		login.btnForgetPassword();
	}

	@Then("User should receive a password reset email")
	public void user_should_receive_a_password_reset_email() {

	}

	@When("User enters the password again {string}")
	public void user_enters_the_password_again(String password) {
		fp.changePassword(password);

	}

	@Then("User should see a success message {string}")
	public void user_should_see_a_success_message(String string) {
		WebElement txtMsg = fp.getTxtMsg();
		String text = txtMsg.getText();
		System.out.println(text);
		Assert.assertEquals(string, text);

	}

	@When("User enters an invalid email address {string}")
	public void user_enters_an_invalid_email_address(String email) {
		login.clkForgetPassword(email);

	}

	@Then("User should verify user error message {string}")
	public void user_should_verify_user_error_message(String string) {
		WebElement txtUserNotExit = login.getTxtUserNotExit();
		String text = txtUserNotExit.getText();
		Assert.assertEquals(string, text);

	}

}
