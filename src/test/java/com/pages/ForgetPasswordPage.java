package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseClass;

public class ForgetPasswordPage extends BaseClass {

	public ForgetPasswordPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Resetpassword")
	private WebElement txtReserPswd;
	@FindBy(xpath = "//span[@id='reset-login-otp-text']")
	private WebElement btnChange;
	@FindBy(xpath = "//div[text()='Try again after Sometime']")
	private WebElement txtMsg;

	public WebElement getTxtReserPswd() {
		return txtReserPswd;
	}

	public WebElement getTxtMsg() {
		return txtMsg;
	}

	public WebElement getBtnChange() {
		return btnChange;
	}

	public void changePassword(String string) {
		typeText(getTxtReserPswd(), string);
		btnClick(getBtnChange());
	}
//	public void resetPassword(String string) {
//		typeText(getTxtReserPswd(), string);
//
//	}
}
