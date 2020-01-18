package com.assignment.constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserOperations {
	
	public static WebDriver driver;

	@BeforeMethod
	
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver","F:\\selenium lib\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("disable-infobars");
		obj.addArguments("disable-notifications");

		driver = new ChromeDriver(obj);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}


}
