package com.utility;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	// BrowserLaunch
	public static void getDriver(String browserName) {
		switch (browserName) {
		case "chrome":
			// WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			// WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			// WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("invalid browser name");
			break;
		}
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
	}

	// Launch url
	public void searchUrl(String url) { // 1
		driver.get(url);
	}

	// method for send keys
	public void typeText(WebElement element, String data) { // 2
		element.sendKeys(data);
	}

	// btn Click
	public void btnClick(WebElement element) { // 3
		element.click();
	}

	// get text
	public String getText(WebElement element) { // 4
		String text = element.getText();
		System.out.println(text);
		return text;
	}

	// getAttribute
	public String getAttribute(WebElement element, String data) { // 5
		String attribute = element.getAttribute(data);
		System.out.println(attribute);
		return attribute;
	}

	// close
	public void close() { // 6
		driver.close();
	}

	// quit
	public static void quit() { // 7
		driver.quit();
	}

	public byte[] screenshotBase() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] bs = screenshot.getScreenshotAs(OutputType.BYTES);
		return bs;

	}

}
