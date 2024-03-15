package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseClass;

public class RegistrationPage extends BaseClass {

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='Sign-Up-Pop'])[2]")
	private WebElement signUpEnable;
	@FindBy(xpath = "//div[text()='Invalid parameters']")
	private WebElement invalidParaMsg;
	@FindBy(id = "signup-username")
	private WebElement fullName;
	@FindBy(id = "signup-email")
	private WebElement emailAddress;
	@FindBy(name = "signupMobile")
	private WebElement mobile;
	@FindBy(id = "signup-password")
	private WebElement password;
	@FindBy(id = "signup-confirmPassword")
	private WebElement conformPswd;
	@FindBy(xpath = "//input[@id='terms-vms-policy']")
	private WebElement checkBoxAgree;
	@FindBy(xpath = "//input[@id='newsLetter']")
	private WebElement checkBoxYes;
	@FindBy(id = "signup-submit-text")
	private WebElement register;
	@FindBy(xpath = "//span[text()='Already a user?']")
	private WebElement alreadyUser;

	public WebElement getAlreadyUser() {
		return alreadyUser;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConformPswd() {
		return conformPswd;
	}

	public WebElement getCheckBoxAgree() {
		return checkBoxAgree;
	}

	public WebElement getCheckBoxYes() {
		return checkBoxYes;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getInvalidParaMsg() {
		return invalidParaMsg;
	}

	public WebElement getSignUpEnable() {
		return signUpEnable;
	}

	public void fillRegistrationDetails(String string, String string2, String string3, String string4, String string5) {
		typeText(getFullName(), string);
		typeText(getEmailAddress(), string2);
		typeText(getMobile(), string3);
		typeText(getPassword(), string4);
		typeText(getConformPswd(), string5);
		btnClick(getCheckBoxAgree());
		btnClick(getCheckBoxYes());

	}

	public void clickRegistration() {
		btnClick(getRegister());

	}

	public void clkAlreadyuser() {
		btnClick(getAlreadyUser());

	}
}
