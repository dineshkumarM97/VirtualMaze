package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseClass;

public class DashBoard extends BaseClass {
	
	public DashBoard() {
		PageFactory.initElements(driver, this);
	}
	//h3[text()='Privacy & Personalisation']
	
	@FindBy(xpath = "//div[@class='details']/child::h3[text()='Privacy & Personalisation']")
	private WebElement succesMsg;

	public WebElement getSuccesMsg() {
		return succesMsg;
	}
	

}
