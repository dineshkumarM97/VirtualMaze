package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='Sign-Up-Pop'])[1]")
	private WebElement signUp;
	@FindBy(name = "email")
	private WebElement emailId;
	@FindBy(name = "pswd")
	private WebElement passWord;
	@FindBy(id = "Forgot-Password")
	private WebElement forgetPassword;
	@FindBy(id = "login-submit-text")
	private WebElement btnLogin;
	@FindBy(xpath = "//span[contains(text(),'New user?')]")
	private WebElement registerHere;
	@FindBy(xpath = "//div[text()='Incorrect emailId or Password, Try again']")
	private WebElement txtErrorMsg;
	@FindBy(xpath="//div[contains(text(),'User doesn')]")
	private WebElement txtUserNotExit;

	public WebElement getTxtErrorMsg() {
		return txtErrorMsg;
	}

	public WebElement getTxtUserNotExit() {
		return txtUserNotExit;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getForgetPassword() {
		return forgetPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getRegisterHere() {
		return registerHere;
	}

	public void loginMethod(String userName, String passWord) {
		typeText(getEmailId(), userName);
		typeText(getPassWord(), passWord);
	}

	public void btnLogin() {
		btnClick(getBtnLogin());

	}

	public void navigateRegistration() {
		btnClick(getRegisterHere());
	}

	public void clkForgetPassword(String string) {
		typeText(getEmailId(), string);
	}

	public void btnForgetPassword() {
		btnClick(getForgetPassword());
	}
}
