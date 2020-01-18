package com.assingment.implement;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assignment.constants.BrowserOperations;
import com.assignment1.specifications.IphonePricingSpecifications;



public class IphonePricingImplements extends BrowserOperations {
	
	public void  amazoniphone() throws Exception
	{
		driver.get("https://www.amazon.in");
		driver.findElement(IphonePricingSpecifications.search).sendKeys("iPhone XR (64GB)-Yellow");
		driver.findElement(IphonePricingSpecifications.click_button).click();
		driver.findElement(IphonePricingSpecifications.iphoneyellow).click();
		Set<String> total_windows=driver.getWindowHandles();
		Object windows[]=total_windows.toArray();
		String parent_window=windows[0].toString();
		String child_window=windows[1].toString();
		driver.switchTo().window(child_window);
		IphonePricingSpecifications.amazon_price=driver.findElement(IphonePricingSpecifications.price).getText();
		System.out.println(IphonePricingSpecifications.amazon_price);
        driver.switchTo().window(parent_window);
        driver.close();
        driver.switchTo().window(child_window);
		
		
	}

	public void flipkartiphone() throws Exception
	{
		driver.get("https://flipkart.com");
		driver.findElement(IphonePricingSpecifications.fx).click();
		driver.findElement(IphonePricingSpecifications.fsearch).sendKeys("iPhone XR (64GB)-Yellow");
		driver.findElement(IphonePricingSpecifications.fclick_button).click();
		driver.findElement(IphonePricingSpecifications.fiphoneyellow).click();
				
		Set<String> total_windows=driver.getWindowHandles();
		System.out.println(total_windows);
		Object[] windows=total_windows.toArray();
		Thread.sleep(4000);
		String child_window=windows[1].toString(); 
		driver.switchTo().window(child_window);
	
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		WebElement fprice1 =wait.until(ExpectedConditions.visibilityOf(driver.findElement(IphonePricingSpecifications.fprice))); 
		IphonePricingSpecifications.flipkart_price=driver.findElement(IphonePricingSpecifications.fprice).getText();
		System.out.println(IphonePricingSpecifications.flipkart_price);
		
	} 
	
	public void validation() throws Exception
	{
		String price1=IphonePricingSpecifications.amazon_price.replaceAll("[₹,.]","").trim();
		String price2=IphonePricingSpecifications.flipkart_price.replaceAll("[₹,.]","").trim();
		int amazonprice=Integer.parseInt(price1);
		int flipkartprice=Integer.parseInt(price2);
		if(amazonprice>flipkartprice)
		{
			System.out.println("Iphone price is lesser in amazon");
		}
		else 
		{
			System.out.println("Iphone price is lesser in flipkart");
		}
	}
}